
public class TripleStep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(countWays(3));
		
	}

	public static int countWays(int n)
	{
		
		if(n<0)
		return 0;
		else if(n==1||n==0)
		return 1;
		else
			return countWays(n-1)+countWays(n-2)+countWays(n-3);
		
		
	}
	
}
