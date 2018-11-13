package ReverseLinkedListII;

public class ReverseLinkedListII {

public ListNode reverseBetween(ListNode head, int m, int n) {
    
	if(head==null||m==n) return head;
    ListNode temp1=null,temp2=null,index1=head,index2=null,temp=head,start=null,end=null,dummy=new ListNode(1);
	dummy.next=head;
	index1=dummy;
	int count=1;
	while(temp!=null)
	{
		if(count<m) index1=temp;
		if(count==m) {start=temp;temp1=temp.next;System.out.println(start.val);}
		if(count==n) {end=temp;temp=temp2;index2=temp;break;}
		if(count>=m&&count<n)
		{
			if(count==m) temp.next=null;
			temp2=temp1.next;
			temp1.next=temp;
			temp=temp1;
			temp1=temp2;
		}
		else
			temp=temp.next;
		count++;
	}
	index1.next=end;
	start.next=index2;
	return dummy.next;
    }
}
