public class ListaDoble <E>extends Lista<E>{
    protected Nodo <E> inicio, fin;
    public ListaDoble(){
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
        fin.siguiente =new Nodo(item, null, fin);
        fin=fin.siguiente;
        }else{
        inicio= new Nodo(item, null, null);
        fin= inicio;
        }
    }

    /**
     *
     * @return devuelve el dato elminado (del tope del stack)
     */
    @Override
    public E pop() {
     E aEliminar=fin.valor;
     if(inicio==fin) {
        inicio=null;
        fin=null;
        }else{
         fin=fin.anterior;
         fin.siguiente=null;
         }
     return aEliminar;

    }

    /**
     *
     * @return devuelve el ulyimo termino agregado
     */
    @Override
    public E peek() {
        return fin.valor;
    }

    /**
     *
     * @return devuelve boolean indicando si esta vacia
     */
    @Override
    public boolean empty() {
        if (inicio==null) return true;
        else return false;
    }

    /**
     *
     * @return devuuelve el tamano del stack
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


