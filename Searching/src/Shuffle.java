
/*We are given 3 strings: str1, str2, and str3. Str3 is said to be a shuffle of str1 
and str2 if it can be formed by interleaving the characters of str1 and str2 in 
a way that maintains the left to right ordering of the characters from each string.
For example, given str1="abc" and str2="def", str3="dabecf" is a valid shuffle since 
it preserves the character ordering of the two strings. So, 
given these 3 strings write a function that 
detects whether str3 is a valid shuffle of str1 and str2.*/


public class Shuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s1="abcg";
	String s2="defh";
	String s3="dacebfgh";
	boolean result=checkInterleave(s1,s2,s3);
	System.out.println(result);
	
	
	}
	
	
	public static boolean checkInterleave(String first,String second,String third)
	
	
	{
	    if(third.length()!=first.length()+second.length())
	    	    return false;
	    else
	     {   int i=0,j=0,k=0;
	        
	          while(k<=third.length()-1)
	          {
	        	  
	        	  
	        	     if(i<=first.length()-1&&third.charAt(k)==first.charAt(i))
	        	    	    i++;
	        	     else if(j<=second.length()-1&&third.charAt(k)==second.charAt(j))
	        	        j++;
	        	     
	        	     else
	        	    	     return false;
	        	    
	        	     k++; 
	          }
	    	
	      return true;
	    	
	     }
	    
	    
     
		
		
		
		
		
	}
	

}
