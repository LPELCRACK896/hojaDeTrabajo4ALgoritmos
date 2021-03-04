import java.util.Vector;

public class Vectorr <E> implements Stack<E>{
    private Vector<E> stack;

    public Vectorr(){
        stack= new Vector<E>(0);

    }

    /**
     *
     * @param item ingresa el item a agregar (pushear)
     */
    @Override
    public void push(E item) {
        stack.add(item);
    }

    /**
     *
     * @return devuelve el valor eliminado
     */
    @Override
    public E pop() {
        if(stack.isEmpty())return null;
        else{
            E temporal =stack.elementAt(stack.size()-1);
            stack.remove(stack.size()-1);
            return temporal;
        }
    }

    /**
     *
     * @return devuelve el ultimo valor agregado
     */
    @Override
    public E peek() {
        if(!empty())return stack.elementAt(stack.size()-1);
        else return null;
    }

    /**
     *
     * @return devuelve boolean indicando si esta vacio
     */
    @Override
    public boolean empty() {
        return stack.isEmpty();
    }

    /**
     *
     * @return devuelve el tamano del stack
     */
    @Override
    public int size() {
        return stack.size();
    }

}
