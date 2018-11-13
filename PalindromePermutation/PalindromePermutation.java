package PalindromePermutation;

import java.util.HashMap;

public class PalindromePermutation {

public boolean canPermutePalindrome(String s) {
     HashMap<Character,Integer> map=new HashMap<>();
     for(char c:s.toCharArray())
    	 map.put(c,map.getOrDefault(c,0)+1);
     int count=0;
     for(char c:map.keySet())
     {
    	 if(map.get(c)%2!=0)
    		 count++;
    	 if(count>=2)
    		 return false;
     }
     return true;
    }
}
