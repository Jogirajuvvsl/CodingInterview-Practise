package MissingNumber;

import java.util.HashMap;

public class MissingNumber {
	
	public static void main()
	{
		int a[]=new int[3];
		int b[]=new int[2];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		b[0]=10;
		b[1]=20;
		
		HashMap<Integer,Integer>  hm=new HashMap<Integer,Integer>();
		for(int i=0;i<b.length;i++)
		if(hm.containsKey(b[i]))
			hm.put(b[i], hm.get(b[i])+1);
		else
			hm.put(b[i],1);
		
		for(int i=0;i<a.length;i++)
			if(hm.get(a[i])>1)
				hm.put(a[i], hm.get(a[i])-1);
			else if(hm.get(a[i])==1)
		         hm.remove(a[i]);
			else if(hm.get(a[i])==null)
		        System.out.println(a[i]);
		
		
		
		
	}
	
	
	

}
