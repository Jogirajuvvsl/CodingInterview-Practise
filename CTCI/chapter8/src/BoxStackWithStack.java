import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BoxStackWithStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	//Box[] boxArray={ new Box(6, 4, 4), new Box(8, 6, 2), new Box(5, 3, 3), new Box(7, 8, 3), new Box(4, 2, 2), new Box(9, 7, 3)};
	Box[] boxArray={ new Box(6, 4, 4), new Box(4,2,2)};
	ArrayList<Box> BoxList=new ArrayList<Box>();
	for(Box b:boxArray)
     BoxList.add(b);
	
	Collections.sort(BoxList,new Comparator<Box>()
			{
		   public int compare(Box B1,Box B2)
		   {
			   return B2.height-B1.height;
		   }
		
		
			});
	for(Box b:BoxList)
	b.print();
	
	System.out.println("The Max Height is "+createStack(BoxList));
	
	
	
	}
	

	public static int createStack(ArrayList<Box> boxList) {
		// TODO Auto-generated method stub
		  int maxHeight=0;
		  int height=0;
		  int stack[]=new int[boxList.size()];
		  for(int i=0;i<boxList.size();i++)
		  {
			  if(stack[i]!=0)
			  height=stack[i];
			  else
			  {height=createStack(boxList,i,stack);
			    stack[i]=height;
			  }
			  System.out.println("Stack at index"+i+" "+height);
			  if(height>maxHeight)
			  maxHeight=height;
			  
		  }
		return maxHeight;
			  
	
	
	
	
	}	
	
	
	public static int createStack(ArrayList<Box> boxList,int bottomIndex,int[] stack)
			{  
			   if(bottomIndex>=boxList.size())
				   return 0;
		       Box bottoBox=boxList.get(bottomIndex);
		       int maxHeight=0;
		       int height = 0;
			for(int i=bottomIndex+1;i<boxList.size();i++)
		       {   
		         if(bottoBox.canbeBelow(boxList.get(i)))
		         {
                  if(stack[i]==0)
		        	 {height=createStack(boxList,i,stack);
		        	  stack[i]=height;
		        	 }
                 else
                 height=stack[i];
                	 maxHeight=Math.max(height,maxHeight);
             	
		         }
		       }   
	
	return maxHeight+bottoBox.height;

	
}
	
}	


/*class Box
{
	int length;
	int width;
	int height;
	
	public Box(int length,int width,int height)
	{
		
		this.length=length;
		this.width=width;
		this.height=height;
		
		
	}
	
	public boolean canbeBelow(Box box)
	{
		if(length>box.length&&width>box.width&&height>box.height)
		return true;	
		else
		return false;
		
	}
	
	public void print()
	{
		
		System.out.println("Size is "+this.length+" "+this.width+" "+this.height);
		
	}
	
	
}*/

/*class BoxComparator implements Comparator<Box>
{
	
 public int compare(Box b1,Box b2)
 {
	 
	 return b2.width-b1.width;
	 
 }
	
	
}*/	


