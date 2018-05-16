import java.util.Comparator;
import java.util.PriorityQueue;

public class WindowMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
new Solution().maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3)	;	

	}

}


class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
    int[] result;
     int j=0;   
        if(nums==null||k==0||nums.length<k)
          result=new int[0];    
        else
        {
            result=new int[nums.length-k+1];
          PriorityQueue<Integer> pq=new PriorityQueue<Integer>(k,new Comparator<Integer>()
                                                                     {
                                                                      @Override 
                                                                      public int compare(Integer a1,Integer a2)
                                                                      {
                                                                          return a2-a1;
                                                                          
                                                                      }
                                                                     } );
        
        for(int i=0;i<nums.length;i++)
        {
            if(pq.size()<k-1)
            {  System.out.println("Offer 1"+nums[i]);
               pq.offer(nums[i]);
            }
            else
            { if(i>k-1)
                {pq.offer(nums[i]);System.out.println("Offer 2"+nums[i]);}
                result[j++]=pq.peek();
                System.out.println("Peek"+pq.peek());
                pq.remove(nums[i-k+1]);
            }
            
        }
            
 
        
        
                                                                       
                                                           
   
              
         
    }
		return result;
    
}
}

                                                                   
                                                                     
                                                                                              