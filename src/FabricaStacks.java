import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class FabricaStacks {
    public static Stack construir(String tipo, String lista){
        switch (tipo){
            case "ArrayList":
                return new ArayList();
            case "Vector":
                return new Vectorr();
            case "Lista":
                return new FabricaList().construir(lista); 
            default:
                System.out.println("No se reconoce el tipo de lista");
                return null;
        }
    }
}
