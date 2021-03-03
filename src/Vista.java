public class Vista {

    public Vista() {}

    /**
     * ejecuta el programa y crea objeto tupo calculadora
     */
    public void execute() {
        Lector reader = new Lector();
        /**
         * AHORA LA CALCULADORA PIDE EL PARAMETRO DEL TIPO DE STACK QUE QUIERE
         * OPCIONES VALIDAS:
         * -"Lista simple"
         * -"Lista doble"
         * -"ArrayList"
         * -"Vector"
         * VER CLASE: FabricaStacks
         */
        //Calculadora calculadora = new Calculadora();
        String peticion = reader.readFile();
        //System.out.println("Resultado: " + String.valueOf(calculadora.resolver(peticion)));
        System.out.println("Resultado: " + String.valueOf(peticion));
    }
}
