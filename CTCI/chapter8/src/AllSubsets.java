import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllSubsets {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

      ArrayList<Integer> list=new ArrayList<Integer>();
      ArrayList<ArrayList<Integer>> allLists=new ArrayList<ArrayList<Integer>>();
	  for(int i=1;i<3;i++)
		list.add(i);
		System.out.println(getSubSets(list,0,allLists));
	
	}
	



	public static ArrayList<ArrayList<Integer>> getSubSets(List<Integer> set,int index,ArrayList<ArrayList<Integer>> allLists)
	{
		 
	  if(index==set.size())
		  return allLists;
	  if(allLists.size()==0)
	  {
		  allLists.add(new ArrayList<Integer>());
		  ArrayList<Integer> list=new ArrayList<Integer>();
		  list.add(set.get(index));
		  allLists.add(list);
	  }
	  else
	  {   ArrayList<ArrayList<Integer>> tempList=new ArrayList<ArrayList<Integer>>();
		  for(ArrayList<Integer> list:allLists)
		  {
			  ArrayList<Integer> templist=new ArrayList<Integer>(list);
			  
			  
			  templist.add(set.get(index));
			  tempList.add(templist); 
			 
		  }
	      allLists.addAll(tempList)	;
	      
		  
		  
		  
	  }
	  /*ArrayList<ArrayList<Integer>> newLists=new ArrayList<ArrayList<Integer>>();
	  newLists.addAll(allLists);*/
	 return getSubSets(set,index+1,allLists);
	  
		
		
	}
	
	
}
