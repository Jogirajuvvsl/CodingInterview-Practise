
public class Trie {
	
	TrieNode root;
	
	public Trie()
	{
		root=new TrieNode();
		root.data=' ';
		
     }
    public void insert(String word)	
    {  TrieNode wi=root;
    	
    	for(int i=0;i<word.length();i++)
    	{
    		
    		if(wi.children[word.charAt(i)-'a']==null)
    		{
    			wi.children[word.charAt(i)-'a']=new TrieNode(word.charAt(i));
    			wi=wi.children[word.charAt(i)-'a'];
    			
    			
    		}
    		else
    		{
    			wi=wi.children[word.charAt(i)-'a'];
    			
    			
    		}
    		if(i==word.length()-1)
    		wi.isEndOfString=true;
    		
    	  }
    	
    	
    	
    }
    public boolean search(String word)
    {
    	   TrieNode ws=root;
	   for(int i=0;i<word.length();i++)	
	   {
		   if(ws.children[word.charAt(i)-'a']==null)
		   return false;
		   ws=ws.children[word.charAt(i)-'a'];
	   }
    	
	if(ws.isEndOfString==true)	   
	return true;
	return false;
    }
	
    public boolean startsWith(String word)
    {
    	   TrieNode ws=root;
	   for(int i=0;i<word.length();i++)	
	   {
		   if(ws.children[word.charAt(i)-'a']==null)
		   return false;
		   ws=ws.children[word.charAt(i)-'a'];
	   }
	   return true;
	
    }
	
	
 }

class TrieNode
{
	char data;
	boolean isEndOfString;
	TrieNode[] children=new TrieNode[26];
    	public TrieNode()
	{
		
		
	}
    	public TrieNode(char ch)
    	{
    		this.data=ch;
    		
    	}
	
}


