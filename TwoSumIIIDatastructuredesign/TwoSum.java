package TwoSumIIIDatastructuredesign;

import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {

    /** Initialize your data structure here. */
    HashMap<Integer,Integer> map;
	public TwoSum() {
        map=new HashMap<>();
    }
    
    /** Add the number to an internal data structure.. */
    public void add(int number) {
     	if(map.containsKey(number))
     		map.put(number,2);
     	else
     		map.put(number,1);
    }
    
    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
       for(int k:map.keySet())
       {
    	   if(map.containsKey(value-k))
    	   {
    		   if(value-k!=k||map.get(value-k)==2)
    			   return true;
    	   }
       }
       return false;
    }
}
