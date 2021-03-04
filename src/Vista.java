import java.util.Scanner;

public class Vista {

    public Vista() {}

    /**
     * ejecuta el programa y crea objeto tupo calculadora
     */
    public void execute() {
        Scanner sc = new Scanner(System.in);
        Lector reader = new Lector();
        Calculadora calculadora = Calculadora.getInstance();
        /**
         * AHORA LA CALCULADORA PIDE EL PARAMETRO DEL TIPO DE STACK QUE QUIERE
         * OPCIONES VALIDAS:
         * -"Lista simple"
         * -"Lista doble"
         * -"ArrayList"
         * -"Vector"
         * VER CLASE: FabricaStacks
         */
        String peticion = reader.readFile();
        System.out.println("Bienveidos a la calculadora Infix");
        int opcion = 0;
        while (opcion != 4) {
            boolean validar_opcion = false;
            while (validar_opcion == false) {
                /*
                 * Presentamos el menú        
                 */
                System.out.println("Elige una opcion\n1.ArrayList\n2.Vector\n3.Lista\n4.Salir\nSeleccione:");
                try {
                    /*
                     * Opetenemos la opción.
                     */
                    opcion = Integer.parseInt(sc.next());
                    if (opcion < 5 && opcion > 0)
                        validar_opcion = true;
                    else
                        System.out.println("Ingrese una opción válida\n");
                } catch (Exception e) {
                    System.out.println("Ingrese un número válido\n");
                }
            }
            if (opcion == 1) {
                calculadora.setStack("ArrayList", "");
                System.out.println("\nResultado: " + calculadora.resolver(peticion) + "\n");
            } else if (opcion == 2) {
                calculadora.setStack("Vector", "");
                System.out.println("\nResultado: " + calculadora.resolver(peticion) + "\n");
            } else if (opcion == 3) {
                int opcion1 = 0;
                boolean validar_opcion1 = false;
                while (validar_opcion1 == false) {
                    /*
                     * Presentamos el menú        
                     */
                    System.out.println("Elige una opcion\n1.Lista Simple\n2.Lista Doble\nSeleccione:");
                    try {
                        /*
                         * Opetenemos la opción.
                         */
                        opcion1 = Integer.parseInt(sc.next());
                        if (opcion1 < 3 && opcion > 0)
                            validar_opcion1 = true;
                        else
                            System.out.println("Ingrese una opción válida\n");
                    } catch (Exception e) {
                        System.out.println("Ingrese un número válido\n");
                    }
                }
                if (opcion1 == 1) {
                    calculadora.setStack("Lista", "Lista simple");
                    System.out.println("\nResultado: " + calculadora.resolver(peticion) + "\n");
                } else if (opcion1 == 2) {
                    calculadora.setStack("Lista", "Lista doble");
                    System.out.println("\nResultado: " + calculadora.resolver(peticion) + "\n");
                }
            } else if(opcion == 4) {
                System.out.println("------- Gracias por usar la calculadora -----");
                System.exit(0);
            }
        }
    }
}