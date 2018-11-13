package SplitArrayintoConsecutiveSubsequences;

import java.util.PriorityQueue;
import java.util.TreeMap;

public class SplitArrayintoConsecutiveSubsequences {

public boolean isPossible(int[] nums) {
	 TreeMap<Integer,PriorityQueue<Integer>> treemap=new TreeMap<>();
     int count=0;
     for(int n:nums)
     {
         int number=0;
         if(treemap.containsKey(n-1))
         {
             int x=treemap.get(n-1).poll();
    		 if(x==2) count--;
    		 number=x+1;
             if(treemap.get(n-1).isEmpty()) treemap.remove(n-1);
         }
    	 else
    	 {	 count++;
    	 	 number=1;
    	 }
    	
    	 if(treemap.containsKey(n))
			 treemap.get(n).add(number);
		 else
		 {
			 treemap.put(n,new PriorityQueue<Integer>());
			 treemap.get(n).add(number);
		 }
     }
     return count==0;
    }
}
