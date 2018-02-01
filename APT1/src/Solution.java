
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode ret = null;
        while(l1!=null) {
        	if(l1.info+l2.info<10) {
        		ret = addAtEnd(ret, l1.info+l2.info);
        	    l1 = l1.next;
        	    l2 = l2.next;
        	}else {
        		ret = addAtEnd(ret, l1.info+l2.info-10);
        		l1 = l1.next;
        		l2 = l2.next;
        		l1.info+=1;
        	}
        }
        return ret;
    }
	
	public ListNode addAtEnd(ListNode head, int value){
		if (head == null)
			return new ListNode(value, null);		
		head.next = addAtEnd(head.next, value);
		return head;
	}
   
}
