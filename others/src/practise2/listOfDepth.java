package practise2;

public class listOfDepth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a[]= {11,30,34,2,34,55,67,7,89,99,100};
	
	quickSort(a,0,a.length-1);
	
	
	for(int i=0;i<a.length;i++)
	System.out.print(a[i]+" ");;
	
	}

	private static void quickSort(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		if(i<j)
		{
	int partitionIndex=partition(a,i,j);
	
	quickSort(a,i,partitionIndex-1);
	quickSort(a,partitionIndex+1,j);
	
		}
	
	}

	private static int partition(int[] a, int low, int high) {
		// TODO Auto-generated method stub
		
		int i=low-1;
		int pivot=a[high];
		for(int j=low;j<high;j++)
		{
			if(a[j]<=pivot)
			{
				i++;
				swap(a,i,j);
				
				
			}
			
			
		}
		
		swap(a,i+1,high);
		
		
		
		
		return i+1;
		
	}

	private static void swap(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}

	
	
	
	
	
}
