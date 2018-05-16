import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;



public class heap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

	    //create a new object and add a custom comparator that provides the "MinHeap" behaviour.
	    PriorityQueue<Integer> minheap=new PriorityQueue<Integer>();
	    //add elements
	    minheap.addAll(Arrays.asList(new Integer[]{8,9,1,2,3,4,5,}));
	    System.out.println("Minheap---------------------");
	    System.out.println(Arrays.toString(minheap.toArray()));
	    for (Iterator iterator = minheap.iterator(); iterator.hasNext();) {
	        
	    	  System.out.println(Arrays.toString(minheap.toArray()));
	    	    System.out.println("Min : "+minheap.element());
	        System.out.println("Removing " + minheap.element());
	        minheap.remove(1);
	    }
	 
	    //create a new object and add a custom comparator that provides the "MaxHeap" behaviour.
	    PriorityQueue<Integer> maxheap=new PriorityQueue<Integer>();
	    System.out.println("Maxheap---------------------");
	    //add elements
	    maxheap.addAll(Arrays.asList(new Integer[]{8,9,1,2,3,4,5,}));
	    System.out.println(Arrays.toString(maxheap.toArray()));
	    for (Iterator iterator = maxheap.iterator(); iterator.hasNext();) {
	        System.out.println("Max : "+maxheap.element());
	        System.out.println("Removing " + maxheap.element());
	        maxheap.remove();		
		
		
		
		
		
		
		
		
		
		
		
	}

}
}
    
