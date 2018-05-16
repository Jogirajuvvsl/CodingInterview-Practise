import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class mergeIntervals {
    public List<Interval> merge(List<Interval> intervals) {
    	//Sorting as per the first variable
        Collections.sort(intervals,new Comparator<Interval>()
                         {
                            public int compare(Interval first,Interval second)
                             {return first.start-second.start;}
      });

                 Stack<Interval> stack=new Stack<Interval>();
        
        
       for(int i=0;i<intervals.size();i++)
       {
  
           if(stack.size()==0)
               stack.push(intervals.get(i));
           else
           {mergeStack(stack,intervals.get(i));System.out.println("Entered Merge");};
           
           
       }
        
        intervals.clear();
        System.out.println(stack.size()+" size of stack");
             while(stack.size()>0)
        {  System.out.println("Inside while");
           Interval temp=stack.pop();
           System.out.println(temp.start+" "+temp.end);
           intervals.add(0,temp);
        }
        
        
        return intervals;
        
        
       
        
        
    }
    
    
    public  void mergeStack(Stack<Interval> stack,Interval interval)
    {
           if(stack.size()==0)
           {stack.push(interval);return;}
           else
           {
               Interval top=stack.peek();
               if(top.end>=interval.start)
               {top.end=Math.max(top.end,interval.end);
               stack.pop();
                System.out.println("Top details"+top.start+top.end);
               mergeStack(stack,top);
               }
               else
                   stack.push(interval);
               
               return;
               
           }
       
        
    }
    
}