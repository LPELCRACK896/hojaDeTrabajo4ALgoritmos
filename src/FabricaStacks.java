import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class FabricaStacks {
    /**
     *
     * @param tipo ingresa el tipo de Stack que desea generar//opciones validas: ArrayList, Vector y Lista
     * @param lista ingresa el tipo de lista si desea generar // opciones validas: Lista simple, Lista doble
     * @return devuelve el nuevo stack segun el indicado a generar
     */
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
