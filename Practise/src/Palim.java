
class Solution {
    public int threeSumClosest(int[] nums, int target) {
      int diff=Integer.MAX_VALUE,closest=0,second,third,diffTemp=0,sum;
    for(int first=0;first<=nums.length-3;first++)
    {
        second=first+1;
        third=nums.length-1;
        while(second<third)
        {
            sum=nums[first]+nums[second]+nums[third];
            if(sum==target)
            return target;
            else
            {
                diffTemp=sum-target;
                if(target<sum)
                third--;
                if(target>sum)
                 second++;
                    
                
                
             if(Math.abs(diffTemp)<diff)   
             {
                 diff=Math.abs(diffTemp);
                 closest=sum;
                 
                 
             }
            }  
                
            }
            
            
            
            
        }
        
          return closest;
        
    
      
    
    
    
    }
    
}


class Palim
{
 public static void main(String arg[])
 {
	 Solution s=new Solution();
	 int nums[]= {0,1,1,1};
	 int target=100;
	 System.out.println(s.threeSumClosest(nums, target));
	 
	 
 }
 
}

 
	
