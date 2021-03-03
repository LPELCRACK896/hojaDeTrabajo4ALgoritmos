public class FabricaStacks {
    public static Stack construir(String tipo){
        switch (tipo){
            case "Lista simple":
                return new ListaSimple();
            case "Lista doble":
                return new ListaDoble();
            case "ArrayList":
                return new ArayList();
            case "Vector":
                return new Vectorr();
            default:
                System.out.println("No se reconoce el tipo de lista");
                return null;
        }
    }
}
