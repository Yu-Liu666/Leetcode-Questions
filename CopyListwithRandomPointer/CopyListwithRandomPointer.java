package CopyListwithRandomPointer;

import java.util.HashMap;

public class CopyListwithRandomPointer {

public RandomListNode copyRandomList(RandomListNode head) {
     HashMap<RandomListNode,RandomListNode> map=new HashMap<>();
     RandomListNode temp=head, node=head;
     while(temp!=null)
     {
    	 map.put(temp,new RandomListNode(temp.label));
    	 temp=temp.next;
     }
     
     temp=head;
     while(temp!=null)
     {
    	 map.get(temp).next=map.get(temp.next);
    	 map.get(temp).random=map.get(temp.random);
     }
     return map.get(head);
    }
}
