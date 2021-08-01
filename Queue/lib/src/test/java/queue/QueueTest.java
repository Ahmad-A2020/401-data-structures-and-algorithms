package queue;

//import Queue.QueueLinkedLIst;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    Queue<Integer> ql;

    @BeforeEach
   public void setup(){
        ql= new Queue();
        ql.enqueue(5);
        ql.enqueue(3);
    }

   @Test
    public void enqueu(){

       assertFalse(ql.isEmpty());

   }
   @Test
    public void enqueuTwo(){
        assertEquals("QueueLinkedLIst{front=5, back=3}",ql.toString());
   }
   @Test
    public void peekTest(){
        assertEquals(5,ql.peek());

   }
    @Test
    public void isEmptyTest(){
        assertFalse(ql.isEmpty());

    }





}
