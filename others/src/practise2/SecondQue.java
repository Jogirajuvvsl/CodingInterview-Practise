package practise2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SecondQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] strings=new String[] {"111 AAA","111 AAB","111 AAC","111 123"};
		Arrays.sort(strings,new  Comparator<String>()

		{

	

	      public int compare(String word1,String word2)

	      

	    {

	    	  

	    int index1=word1.indexOf("");

	    int index2=word2.indexOf("");

	   if(word1.substring(index1+1).compareTo(word2.substring(index2+1))==0)

	   return word1.substring(0,index1).compareTo(word2.substring(0,index2));

	   else

	   return word1.substring(index1).compareTo(word2.substring(index2));

	    	  

	    	}

	

	});
		for(String string:strings)
		System.out.println(string);
	 System.out.println(processLogFile(strings.length,Arrays.asList(strings)));
		
		
		
		
	}






	public static List<String> processLogFile(int len,List<String> listLogFile)

	{

	Collections.sort(listLogFile,new  Comparator<String>()

			{

		

		      public int compare(String word1,String word2)

		      

		    {

		    	  

		    int index1=word1.indexOf("");

		    int index2=word2.indexOf("");

		   if(word1.substring(index1+1).compareTo(word2.substring(index2+1))==0)

		   return word1.substring(0,index1-1).compareTo(word2.substring(0,index2-1));

		   else

		   return word1.substring(index1).compareTo(word2.substring(index2));

		    	  

		    	}

		

		});

	

	

return listLogFile;

	

	

	

	

}





}
