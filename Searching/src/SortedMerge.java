
public class SortedMerge {

	public static void main(String[] args) {
		
	int nums1[]= {1,2,30,0,0,0},nums2[]= {4,5,6};
	int m=3,n=3;
	
	new Solution().merge(nums1,3,nums2,3);

	}

}


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    
        int finalIndex=nums1.length-1;
        int indexA=m-1,indexB=n-1;
        while(indexB>=0)
        {
            if(indexA>=0)
            { if(nums1[indexA]>=nums2[indexB])
               nums1[finalIndex--]=nums1[indexA--];
              else     
              nums1[finalIndex--]=nums2[indexB--];
                
            }
            else
            {
               while(indexB>=0)   
                 nums1[finalIndex--]=nums2[indexB--];
                
            }
            
            
        }
        
     for(int ele:nums1)
    	 System.out.print(ele+" ");
    
}
    
}  