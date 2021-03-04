public class FabricaList {
    /**
     *
     * @param tipo ingresa el tipo de lista que desea construir
     * @return devuelva una "new" lista
     */
    public static Lista construir(String tipo) {
        switch(tipo) {
            case "Lista simple":
                return new ListaSimple();
            case "Lista doble":
                return new ListaDoble();
            default:
                return null;
        }
    }
}
