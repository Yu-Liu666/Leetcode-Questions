package FlattenaMultilevelDoublyLinkedList;

public class Iterative {

	public Node flatten(Node head) {
        Node temp=head;
        while(temp!=null)
        {
        	if(temp.child==null)
        	{
        		temp=temp.next;
        		continue;
        	}
        	Node c=temp.child;
        	Node next=temp.next;
        	while(c.next!=null)
        		c=c.next;
        	c.next=next;
        	if(next!=null)
        		next.prev=c;
        	temp.child.prev=temp;
        	temp.next=temp.child;
        	temp.child=null;
        	temp=temp.next;
        }
        return head;
    }
	
}
