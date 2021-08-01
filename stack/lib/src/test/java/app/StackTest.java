package app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    Stack<Integer> sl= new Stack<Integer>();
    @BeforeEach
    public  void starup(){
        sl.push(5);
        sl.push(6);
    }
    @Test
    public void pushTest1and2(){

        assertEquals("[ 6 ] << [ 5 ] <<  [null]",sl.content());
    }
    @Test
    public void popTest(){
        assertEquals(6,sl.pop());
    }

    @Test
    public void popTestEmpty(){
        sl.pop();
        sl.pop();
        assertTrue(sl.isEmpty());

    }

    @Test
    public void peekTest(){
        sl.push(5);
        sl.push(6);
        assertEquals(6,sl.peek());

    }

}
