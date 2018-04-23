
public class TripleStepWithDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	countWays(4);
	
	}

	
	public static void  countWays(int n)
	{
		int[] steps=new int[n+1];
		
		System.out.println(countWays(steps,n,0));
		
	}
	
	
	public static int countWays(int[] steps,int targetStep,int sourceStep)
	{
		
		if(targetStep<0)
			return 0;
		else if(targetStep==0)
			return 1;
		else
		{
			if(steps[targetStep]!=0)
				return steps[targetStep];
			else
				{steps[targetStep]=countWays(steps,targetStep-1,sourceStep)+
						countWays(steps,targetStep-2,sourceStep)+countWays(steps,targetStep-3,sourceStep);
			     return steps[targetStep];
				}
			
		}
		
			
		
	}
	
	
}
