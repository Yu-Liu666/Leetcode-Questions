package PlusOneLinkedList;

public class PlusOneLinkedList {

public ListNode plusOne(ListNode head) {
        ListNode newHead=reverse(head,null);
        ListNode temp=newHead;
        int c=0;
        while(temp!=null)
        {
        	if(temp.val+1<=9) {temp.val=temp.val+1;c=0;break;}
        	else {temp.val=0;temp=temp.next;c=1;}
        }
        head=reverse(newHead,null);
        if(c==1) {
        	ListNode t=new ListNode(1);
        	t.next=head;
        	return t;
        }
        return head;
        
    }
ListNode reverse(ListNode head,ListNode newHead) {
	if(head==null) return newHead;
	ListNode next=head.next;
	head.next=newHead;
	return reverse(next,head);
}
}
