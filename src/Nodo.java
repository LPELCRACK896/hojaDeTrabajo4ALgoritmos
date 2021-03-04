public class Nodo <E>{
    public Nodo siguiente;
    public E valor;
    public Nodo anterior;
    public Nodo(E valor){
        this.valor=valor;
        anterior=null;
        siguiente=null;
    }

    /**
     *
     * @param valor ingresa el valor del nodo
     * @param siguiente ingresa el valor del puntero siguiente al nodo creado
     */
    public Nodo (E valor, Nodo siguiente){
        this.valor=valor;
        this.siguiente=siguiente;
    }

    /**
     *
     * @param valor ingresa el dato del nodo
     * @param siguiente ingresa el nodo siguiente (puntero)
     * @param anterior ingresa el nodo que le precede (puntero)
     */
    public Nodo (E valor, Nodo siguiente, Nodo anterior){
        this.valor=valor;
        this.siguiente=siguiente;
        this.anterior=anterior;
    }}
