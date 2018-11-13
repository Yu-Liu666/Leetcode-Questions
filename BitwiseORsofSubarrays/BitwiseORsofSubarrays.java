package BitwiseORsofSubarrays;

import java.util.HashSet;

public class BitwiseORsofSubarrays {

public int subarrayBitwiseORs(int[] A) {
	 HashSet<Integer> set=new HashSet<>(), res=new HashSet<>(), temp;
     for(int i:A) {
    	 temp=new HashSet<Integer>();
         temp.add(i);
    	 for(int j:set)
    		 temp.add(j|i);
    	 res.addAll(set=temp);
     }
     return res.size();
    }
}
