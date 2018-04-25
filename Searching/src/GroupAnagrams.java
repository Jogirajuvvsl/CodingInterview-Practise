import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  System.out.print(groupAnagrams(new String[] {"abc","cde"}).toString());
		
	}
		 public static   List<List<String>> groupAnagrams(String[] strs) {
		        
		    	HashMap<String,ArrayList<String>> hmap=new  	HashMap<String,ArrayList<String>>();
		        for(String str:strs)
		        {
		            char[] charArray=str.toCharArray();
		            Arrays.sort(charArray);
		            String temp=new String(charArray);
		            ArrayList<String> listTemp;
		            if(hmap.containsKey(temp))
		            {
		            	 listTemp=hmap.get(temp);
		            	  listTemp.add(temp);
		            	  hmap.put(temp, listTemp);
		            	
		            	
		            }
		            else
		            {	listTemp=new ArrayList<String>();
		                listTemp.add(str);
		                hmap.put(temp, listTemp);
		            
		            }
		            
		        
		       }
		
		        List<List<String>> result=new ArrayList<List<String>>();
		        for( String str:hmap.keySet())
		        {   ArrayList<String> list=hmap.get(str);
		            result.add(list);  
		        }
				return result;
		        	
		        	
		        }
		        	
		    
		    
		
		
		
	}


