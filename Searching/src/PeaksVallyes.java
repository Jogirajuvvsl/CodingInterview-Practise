import java.util.Arrays;

public class PeaksVallyes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int nums[]= {5,3,1,2,3};
		Arrays.sort(nums);
		adjustToPeakNValley(nums);
		for(int ele:nums)
		System.out.print(ele+"");
		
	}
	
//Method to adjust the array to PeakNValleys	
public static void 	adjustToPeakNValley(int[] nums)
{
	
	for(int i=1;i<nums.length;i=i+2)
		if(nums[i]>nums[i-1])
			swap(nums,i,i-1);
	
	
	
}

//swap the adjacent element when they are in wrong order for PeakNValleys
public static void swap(int[] nums,int locA,int locB)
{
	int temp=nums[locB];
	    nums[locB]=nums[locA];
	    nums[locA]=temp;
	
	
}

	

}
