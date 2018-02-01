import java.util.*;

public class DoubleBack {
	public ListNode move2Front(ListNode list) {
		int last = 0;
		ListNode news = null;
		ListNode copy = list;
        if(list == null) return list;
        if(list.next == null) {
        	copy = addAtEnd(copy, list.info);
        	return copy;
        }
        
        while(list.next!=null) {
        	list = list.next;
        	last = list.info;
        }
        
        news = addAtEnd(news, last);
        news = addAtEnd(news, last);
        while(copy.next!=null) {
        	news = addAtEnd(news, copy.info);
        	copy = copy.next;
        }
        return news;
    }
	
	public ListNode addAtEnd(ListNode head, int value)
	{
		if (head == null)
			return new ListNode(value, null);		
		head.next = addAtEnd(head.next, value);
		return head;
	}
}
