public class Vista {

    public Vista() {}

    /**
     * ejecuta el programa y crea objeto tupo calculadora
     */
    public void execute() {
        Lector reader = new Lector();
        //Calculadora calculadora = new Calculadora();
        String peticion = reader.readFile();
        //System.out.println("Resultado: " + String.valueOf(calculadora.resolver(peticion)));
        System.out.println("Resultado: " + String.valueOf(peticion));
    }
}
