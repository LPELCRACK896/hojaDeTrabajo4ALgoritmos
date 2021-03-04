public class FabricaList {
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
