
public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1=null;
		String str2="";
		String str3=" ";
		//System.out.println("String1 is"+str1.length());
		System.out.println("String2 is"+str2.length());
		System.out.println("String3 is"+str3.length());
		new Solution().reverseWords("abc");
		
	}

}
 class Solution {
    public String reverseWords(String s) {
    	    String s1="  a  b ";
        String str[]=s1.split(" ");
        String space=" ";
        String result="";
        for(int i=str.length-1;i>=0;i--)
            
          if(!str[i].equals(space))  
          {System.out.println(" String is "+i+"  "+str[i]+"length"+str[i].length());
        	 
          }
            
            
        
      return  result.trim();
        
    }
}