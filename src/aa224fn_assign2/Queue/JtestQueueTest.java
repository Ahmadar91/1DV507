package aa224fn_assign2.Queue;

import org.junit.Test;

import static org.junit.Assert.*;


public class JtestQueueTest {
    

	LinkedQueue testLQ = new LinkedQueue();
    LinkedQueue testObj = new LinkedQueue();

    @Test
    public void testEmpty(){
    	
        assertEquals(0, testLQ.size());
        assertTrue(testLQ.isEmpty());
    }

    @Test
    public void enqueueSingleton()  {
 
        testLQ.enqueue(1);

        assertEquals(1, testLQ.size());
        assertTrue(!testLQ.isEmpty());
    }

   
    @Test
    public void enqueueTen()  {

        for (int i = 0; i <10 ; i++) {
            testLQ.enqueue(i);
        }
        assertEquals(10, testLQ.size());
        assertTrue(!testLQ.isEmpty());
    }

    @Test
    public void enqueueString() {

        for (int i = 0; i < 10 ; i++) {
            testObj.enqueue("A");
        }
        assertEquals(10, testObj.size());
        assertTrue(!testObj.isEmpty());
    }
    @Test
    public void TestSize()  {

        for (int i = 0; i <10 ; i++) {
            testLQ.enqueue(i);
        }
        assertEquals(10, testLQ.size());
        
        for (int i = 0; i < 10; i++) {
            testLQ.dequeue();
        } 
        assertTrue(testLQ.isEmpty());
    }
    
    
    @Test
    public void In() throws Exception {

        for (int i = 0; i < 50 ; i++) {
            testLQ.enqueue(i);
        }
        assertTrue(!testLQ.isEmpty());
    }
    @Test
    public void TestOut() throws Exception{

       
    	for (int i = 0; i < 20 ; i++) {
            testLQ.enqueue(i);
        }
        for (int i = 0; i < 20 ; i++) {
            testLQ.dequeue();
        } 
        assertTrue(testLQ.isEmpty());
    }

    @Test
    public void testToString(){

    }

    @Test(expected = NullPointerException.class)
    public void testNullDequeue(){

        testLQ.enqueue(1);
        testLQ.dequeue();
        testLQ.first();
        testLQ.last();
    }
}