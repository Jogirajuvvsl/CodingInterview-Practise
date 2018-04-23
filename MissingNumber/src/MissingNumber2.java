import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class MissingNumber2 {

	
	public static void main(String str[])
	{
		
		ArrayList<String> list= new ArrayList<String>();
		list.add("aa");
		list.add("def");
		list.add("1231");
		list.add("345");
		
		Collections.sort(list);
			
		/*Collections.sort(list,new  Comparator<String>()
				{
			
			      public int compare(String word1,String word2)
			      
			    {
			    	  
			    int index1=word1.indexOf("");
			    int index2=word2.indexOf("");
			   if(word1.substring(index1).compareTo(word2.substring(index2))==0)
			   return word1.substring(0,index1-1).compareTo(word2.substring(0,index2-1));
			   else
			   return word1.substring(index1).compareTo(word2.substring(index2));
			    	  
			    	}
			
			});*/
		
		
		System.out.println(list);
		
		
		
		
	}
	
	
}
