package queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PseudoQueueTest {
    PseudoQueue<Integer> ps ;
    @BeforeEach
    void pickUp(){
        ps = new PseudoQueue<>();
        ps.enqueue(5);
        ps.enqueue(10);
        ps.enqueue(15);
    }
    @Test
    void dequeueTest(){
        assertEquals(5,ps.dequeue());
    }

    @Test
    void enqueTest(){
        assertEquals("[ 15 ] << [ 10 ] << [ 5 ] <<  [null]",ps.content());
    }


}
