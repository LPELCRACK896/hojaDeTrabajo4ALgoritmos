import java.util.ArrayList;

public class ArayList <E> implements Stack <E>{
    private ArrayList<E> stack;
    public ArayList(){
        stack = new ArrayList<E>();
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
            E temporal =stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            return temporal;
        }
    }

    /**
     *
     * @return devuelve el ultimo valor ingresado
     */
    @Override
    public E peek() {
        if(stack.isEmpty()) return null;
        else return stack.get(stack.size()-1);
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
     * @return devuelve el tamano del arraylist
     */
    @Override
    public int size() {
        return stack.size();
    }
}
