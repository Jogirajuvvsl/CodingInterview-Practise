
public class MagicIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] number= {-10, -5, 0, 1, 4};
	System.out.println(magicIndex(number,0,number.length));
		
		
	}
	
	public static int magicIndex(int[] numbers,int low,int end)
	{
	    if(low>end)
	    	return -1;
	       int mid=(low+end)>>1;
	       if(numbers[mid]==mid)
	    	      return mid;
	       else if(numbers[mid]>mid)
	    	          return magicIndex(numbers,low,mid-1);
	       else 
	    	       return magicIndex(numbers,mid+1,end);
	    
	   
		
		
		
		

		
	}
	
}
