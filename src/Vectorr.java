import java.util.Vector;

public class Vectorr <E> implements Stack<E>{
    Vector<E> stack;

    public Vectorr(){
        stack= new Vector<E>(0);

    }
    @Override
    public void push(E item) {
        stack.add(item);
    }

    @Override
    public E pop() {
        if(stack.isEmpty())return null;
        else{
            E temporal =stack.elementAt(stack.size()-1);
            stack.remove(stack.size()-1);
            return temporal;
        }
    }

    @Override
    public E peek() {
        if(!empty())return stack.elementAt(stack.size()-1);
        else return null;
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
