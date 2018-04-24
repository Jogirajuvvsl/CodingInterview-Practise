
public class SortedMatrixSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int nums[][]= {{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18}};
	
	int[]result=findEle(nums,15);
	for(int i=0;i<result.length;i++)
	System.out.println(result[i]);
	
	
	}
	
	
	
	public static int[] findEle(int[][] matrix,int ele)
	{
		int cols=matrix[0].length-1;
		int rows=matrix.length-1;
		int rowIndex=0,colIndex=matrix[0].length-1;
		
		
		while(rowIndex<=rows&&colIndex>=0)
		{  //When ele is found
		   if(matrix[rowIndex][colIndex]==ele)	
			return new int[] {rowIndex,colIndex};
		   //when ele is more than current,check in bottom matrix
		   else if(ele>matrix[rowIndex][colIndex])
			   rowIndex=rowIndex+1;
		   //when ele is less than current check in eft portion 
		   else 
			    colIndex=colIndex-1;
			
		}
		
       return new int[] {-1,-1};		
		
		
	}
	
	
	}


