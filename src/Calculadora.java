import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import java.util.Arrays;

import java.lang.NumberFormatException;

/**
 * @author Axel Lopez
 * @author Luis Pedro Gonzalez
 *
 */
public class Calculadora {

    private static Calculadora calculadora;
    private Stack < String > stack;
    private String[] operadores = {
        "+",
        "-",
        "*",
        "/"
    };

    /**
     * Constructor privado Singleton
     */
    private Calculadora() { }

    /**
     *
     * @param tipo ingresa el tipo de Stack que desea generar//opciones validas: ArrayList, Vector y Lista
     * @param lista ingresa el tipo de lista si desea generar // opciones validas: Lista simple, Lista doble
     */
    public void setStack(String tipo, String lista) {
        this.stack = FabricaStacks.construir(tipo, lista);
    }

    /**
     * Funcion obtener instancia
     * @return Calculadora
     */
    public static Calculadora getInstance() {
        if(calculadora == null) {
            calculadora = new Calculadora();
        }
        return calculadora;
    }

    /** 
     * @param input
     * @return double
     */
    public String resolver(String input) {
        String[] comandos = input.split(" ");
        for (int i = 0; i < comandos.length; i++) {
            if (!Arrays.asList(operadores).contains(comandos[i])) {
                try {
                    this.stack.push((comandos[i]));
                } catch (NumberFormatException e) {
                    System.out.println("El achivo '.txt' no tiene el formato correcto");
                    return "NaN";
                }
            } else {
                String valor_final = this.stack.pop();
                String valor_inicial = this.stack.pop();
                ScriptEngineManager mgr = new ScriptEngineManager();
                ScriptEngine engine = mgr.getEngineByName("JavaScript");
                try {
                    String resultado = String.valueOf(engine.eval(valor_inicial + " " + comandos[i] + " " + valor_final));
                    this.stack.push(resultado);
                } catch (ScriptException e) {
                    e.printStackTrace();
                }
            }
        }
        return this.stack.pop();
    }

}