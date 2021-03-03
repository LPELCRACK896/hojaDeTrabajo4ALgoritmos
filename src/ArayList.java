import java.util.ArrayList;

public class ArayList <E> implements Stack <E>{
    private ArrayList<E> stack;
    public ArayList(){
        stack = new ArrayList<E>();
    }
    @Override
    public void push(E item) {
        stack.add(item);
    }

    @Override
    public E pop() {
        if(stack.isEmpty())return null;
        else{
            E temporal =stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            return temporal;
        }
    }

    @Override
    public E peek() {
        if(stack.isEmpty()) return null;
        else return stack.get(stack.size()-1);
    }

    @Override
    public boolean empty() {
        return stack.isEmpty();
    }

    @Override
    public int size() {
        return stack.size();
    }
}
