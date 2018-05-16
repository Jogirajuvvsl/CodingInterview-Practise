
public class ReverseList {

	public static void main(String[] args) {
		
		ListNode list1=new ListNode(1);
		list1.next=new ListNode(2);
		new Solution().reverseList(list1);
		//ReverseList.showList(list1);
		//ReverseList.showList(new Solution().reverseList(list1));		
		
		
		
		
  }
	
	static void showList(ListNode list)
	{
		while(list!=null)
			{System.out.println(list.val);
			  list=list.next;}
		
	}
	
	
	

}


class Solution {
    public ListNode reverseList(ListNode head) {
   ListNode result=null;
    if(head==null)
          return result;
    if(head.next==null)    
          return head;
     ListNode first=head;
     ListNode second=head.next;
     while(second!=null)
     {
         System.out.println(second.val);
         ListNode temp=second.next;
         first.next=temp;
         second.next=first;
         first=second;
         second=temp;
         
     }    
        
    return first;    
        
        
        
    }
}

   class ListNode {
      int val;
      ListNode next;
      ListNode(int x) 
      { val = x; }
  
   }
 