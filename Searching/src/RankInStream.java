
public class RankInStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node root=new Node(5);
		System.out.println(root.getRank(5));
		root.insert(1);
		System.out.println(root.getRank(1));
		root.insert(4);
		System.out.println(root.getRank(4));
		root.insert(4);
		System.out.println(root.getRank(4));
		root.insert(5);
		System.out.println(root.getRank(5));
		root.insert(9);
		System.out.println(root.getRank(9));
		root.insert(7);
		System.out.println(root.getRank(7));
		root.insert(13);
		System.out.println(root.getRank(13));
		root.insert(3);
		System.out.println(root.getRank(3));
		
	}

}


class Node
{
	
 Node leftNode;
 Node rightNode;
 int leftSize=0;
 int data=0;
 
 public Node(int d)
 {
	data=d;
 }
 
  void  insert(int d)
 {
     if(d==data)
     {
    	   leftSize++;
       return;	  
     }
     else if(d<data)
     {
    	     if(leftNode==null)
    	       leftNode=new Node(d);
    	     else
    	     leftNode.insert(d);
    	    	 leftSize++;   
     }
     else
     {
    	     if(rightNode==null)
  	       rightNode=new Node(d);
  	     else
  	     rightNode.insert(d);
    
    	 
    	 }
 
 }     
     
     
  
  int getRank(int d)
  {
	if(d==data)
	  return  leftSize; 
	if(data>d)
		 {
		    if(leftNode!=null)
		    return leftNode.getRank(d);
		    else
		    	return 0;
		 }
	else {
		int rightRank;
		if(rightNode!=null)
			rightRank=rightNode.getRank(d);
		else
			rightRank=0;
		return leftSize+1+rightRank;
		
		
	}
		    

  
  
  
  }
  
  
}