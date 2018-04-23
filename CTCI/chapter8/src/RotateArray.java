
public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numbers[]= {1,3,4,5};
	    int noOfRotataions=10;
	    int effectiveRotations=noOfRotataions;
	    if(noOfRotataions>numbers.length)
	    effectiveRotations=noOfRotataions%numbers.length;

	    
	    if(effectiveRotations>0)
	    {
	    	 int temp[]=new int[effectiveRotations];
	    	 for(int i=0;i<effectiveRotations;i++)
	    	  temp[i]=numbers[i];
	    int j=0,i=0,k=effectiveRotations;
	    	
	    for(i=effectiveRotations;i<numbers.length;i++) 
	     numbers[j++]=numbers[i];
	    
	    for(k=0;k<temp.length;k++)
	    numbers[j++]=temp[k];
	    for(int ele:numbers)
	    	System.out.println(ele);
	    	
	    }
	    else
	    {
	    	
	    	for(int ele:numbers)
	    		System.out.println(ele);
	    	
	    }
		
	}

}
