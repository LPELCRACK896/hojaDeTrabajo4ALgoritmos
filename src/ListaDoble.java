public class ListaDoble <E>extends Lista<E>{
    protected Nodo <E> inicio, fin;
    public ListaDoble(){
        inicio=null;
        fin=null;
    }
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

    @Override
    public E peek() {
        return fin.valor;
    }

    @Override
    public boolean empty() {
        if (inicio==null) return true;
        else return false;
    }

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


