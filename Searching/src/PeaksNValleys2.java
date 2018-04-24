import java.util.Arrays;

public class PeaksNValleys2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int nums[]= {25,13,41,52,53};
	
		adjustToPeakNValley(nums);
		for(int ele:nums)
		System.out.print(ele+"");
		
	}
	
//Method to adjust the array to PeakNValleys	
public static void 	adjustToPeakNValley(int[] nums)
{
	
	for(int i=1;i<nums.length;i=i+2)
	{	if(nums[i]>nums[i-1])
			swap(nums,i,i-1);
	    if(i+1<nums.length&&nums[i+1]<nums[i])
	         swap(nums,i+1,i);
	}
	
}

//swap the adjacent element when they are in wrong order for PeakNValleys
public static void swap(int[] nums,int locA,int locB)
{
	int temp=nums[locB];
	    nums[locB]=nums[locA];
	    nums[locA]=temp;
	
	
}

	

}




