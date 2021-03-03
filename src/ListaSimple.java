public class ListaSimple <E>extends Lista<E>{
    protected Nodo <E>inicio, fin;
    public ListaSimple(){
        inicio=null;
        fin=null;
    }
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

