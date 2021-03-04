import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaSimpleTest {
    ListaSimple<String> list = new ListaSimple<>();
    @Test
    void push() {
        list.push("hola");
        assertEquals("hola", list.peek());
    }

    @Test
    void pop() {
        list.push("hola");
        assertEquals("hola", list.pop());
    }

    @Test
    void peek() {
        list.push("hola");
        assertEquals("hola", list.peek());
    }

    @Test
    void empty() {
        assertEquals(true, list.empty());
        list.push("elmento");
        assertEquals(false, list.empty());
    }

    @Test
    void size() {
        list.push("elmento");
        list.push("otro elemento");
        assertEquals(2, list.size());
    }
}