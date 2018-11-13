package AddTwoNumbers;

public class AddTwoNumbers {

public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	 int temp=0;
     ListNode pre=null,ans=pre;
		while(l1!=null||l2!=null)
		{
			int n1=l1==null?0:l1.val;
			int n2=l2==null?0:l2.val;
			ListNode node=new ListNode((temp+n1+n2)%10);
			temp=(temp+n1+n2)/10;
			if(pre==null) {pre=node;ans=pre;}
			else {pre.next=node;pre=node;}
         if(l1!=null)
         l1=l1.next;
         if(l2!=null)
         l2=l2.next;
		}
		if(temp!=0) {pre.next=new ListNode(temp);}
		return ans;
    }
}
