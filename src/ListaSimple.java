public class ListaSimple <E>extends Lista<E>{
    protected Nodo <E>inicio, fin;
    public ListaSimple(){
        inicio=null;
        fin=null;
    }

    /**
     *
     * @param item ingresa el item a agregar (pushear)
     */
    @Override
    public void push(E item) {
        if(!empty()){
            fin.siguiente =new Nodo(item, null);
            fin=fin.siguiente;
        }else{
            inicio= new Nodo(item, null);
            fin= inicio;
        }
    }

    /**
     *
     * @return devuelve el valor eliminado
     */
    @Override
    public E pop() {
        E temporal=fin.valor;
        if(inicio==fin) {
            inicio=null;
            fin=null;
        }else{
            Nodo temp=inicio;
            while(temp.siguiente != fin) temp=temp.siguiente;
            fin=temp;
            fin.siguiente=null;
        }
        return temporal;
    }

    /**
     *
     * @return devuelve el ultimo valor agregado al statck
     */
    @Override
    public E peek() {
        return fin.valor;
    }

    /**
     *
     * @return deuelve boolean indicando si el stack esta vacio
     */
    @Override
    public boolean empty() {
        if (inicio==null) return true;
        else return false;
    }

    /**
     *
     * @return devielve el tamano del stack
     */
    @Override
    public int size() {
        int contador=0;
        Nodo temp=inicio;
        do{
            if(temp==null) return contador;
            contador=contador+1;
            temp=temp.siguiente;
        }while(true);
    }
}

