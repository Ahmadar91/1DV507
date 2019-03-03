package aa224fn_assign4.Queue;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Iterator;


public class JtestQueueTest {
    

	LinkedQueue<Integer> numbers = new LinkedQueue<Integer>();
    LinkedQueue<String> names = new LinkedQueue<String>();

    @Test
    public void testEmpty(){
    	
        assertEquals(0, numbers.size());
        assertTrue(numbers.isEmpty());
        assertEquals(0, names.size());
        assertTrue(names.isEmpty());
    }

    @Test
    public void enqueueSingle()  {
 
        numbers.enqueue(1);
        assertEquals(1, numbers.size());
        assertTrue(!numbers.isEmpty());
        names.enqueue("Ahmad");
        assertEquals(1, names.size());
        assertTrue(!names.isEmpty());
    }

    @Test
    public void enqueueint()  {

        for (int i = 0; i <20 ; i++) {
            numbers.enqueue(i);
        }
        assertEquals(20, numbers.size());
        assertTrue(!numbers.isEmpty());
        
        
    }

    @Test
    public void enqueueString() {

    	for (int i = 0; i <20 ; i++) {
        	names.enqueue(""+i);
        }
        assertEquals(20, names.size());
        assertTrue(!names.isEmpty());
    }
    
    @Test
    public void TestSize()  {

        for (int i = 0; i <10 ; i++) {
            numbers.enqueue(i);
        }
        assertEquals(10, numbers.size());
        
        for (int i = 0; i < 10; i++) {
            numbers.dequeue();
        }  
     
        assertTrue(numbers.isEmpty());
        
        for (int i = 0; i <10 ; i++) {
        	names.enqueue(""+i);
        }
        assertEquals(10, names.size());
        
        for (int i = 0; i < 10; i++) {
        	names.dequeue();
        }  
      
        assertTrue(names.isEmpty());     
        
   
    }
    
    
    @Test
    public void TestIn() throws Exception {

        for (int i = 0; i < 50 ; i++) {
            numbers.enqueue(i);
        }
        assertTrue(!numbers.isEmpty());
        
        for (int i = 0; i < 50 ; i++) {
        	names.enqueue(""+i);
        }
        assertTrue(!names.isEmpty());
    }
    @Test
    public void TestOut() throws Exception{

       
    	for (int i = 0; i < 20 ; i++) {
            numbers.enqueue(i);
        }
        for (int i = 0; i < 20 ; i++) {
            numbers.dequeue();
        } 
        assertTrue(numbers.isEmpty());
        
        for (int i = 0; i < 20 ; i++) {
        	names.enqueue(""+i);
        }
        for (int i = 0; i < 20 ; i++) {
        	names.dequeue();
        } 
        assertTrue(names.isEmpty());
    }

    
    @Test
    public void testIterator() {
    	Iterator<Integer> it = numbers.iterator();
    	for (int i = 0; i < 20 ; i++) {
            numbers.enqueue(i);
        }
    	while(it.hasNext()) {
    		System.out.println(it.next());
    	}
    	
    	Iterator<String> it1 = names.iterator();
    	for (int i = 0; i < 20 ; i++) {
    		names.enqueue(""+i);
        }
    	while(it1.hasNext()) {
    		System.out.println(it1.next());
    	}
    }

    @Test
    public void testToString(){

    }

    @Test(expected = NullPointerException.class)
    public void testNullDequeue(){

        numbers.enqueue(1);
        numbers.dequeue();
        numbers.first();
        numbers.last();
        names.enqueue("ahmad");
        names.dequeue();
        names.first();
        names.last();
    }
}