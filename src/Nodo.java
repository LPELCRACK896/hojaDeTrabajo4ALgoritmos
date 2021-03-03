public class Nodo <E>{
    public Nodo siguiente;
    public E valor;
    public Nodo anterior;
    public Nodo(E valor){
        this.valor=valor;
        anterior=null;
        siguiente=null;
    }
    public Nodo (E valor, Nodo siguiente){
        this.valor=valor;
        this.siguiente=siguiente;
    }
    public Nodo (E valor, Nodo siguiente, Nodo anterior){
        this.valor=valor;
        this.siguiente=siguiente;
        this.anterior=anterior;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
}
