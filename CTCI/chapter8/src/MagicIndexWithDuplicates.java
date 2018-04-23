public class MagicIndexWithDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] number={-10, -5, 0, 3, 7};
	System.out.println(magicIndexWithDuplicates(number,0,number.length-1));
		
		
	}
	
	public static int magicIndexWithDuplicates(int[] numbers,int low,int end)
	{
	    if(end<low)
	    	  return -1;
	    int midIndex=(low+end)>>1;
		int midValue=numbers[midIndex];
		if(midValue==midIndex)
			return midIndex;
		/*Search Left*/
		int leftIndex=Math.min(midIndex-1,midValue);
		int leftPos=magicIndexWithDuplicates(numbers,low,leftIndex);
		if(leftPos>=0)
		return leftPos;
		/*Search Right*/
		int rightIndex=Math.max(midIndex+1,midValue);
		int rightPos=magicIndexWithDuplicates(numbers,rightIndex,end);
		return rightPos;
	    
		
	}
	
}