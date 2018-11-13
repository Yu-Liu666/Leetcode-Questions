package XofaKindinaDeckofCards;

import java.util.HashMap;

public class XofaKindinaDeckofCards {

public boolean hasGroupsSizeX(int[] deck) {
    HashMap<Integer, Integer> map=new HashMap<>();
    int min=Integer.MAX_VALUE;
    for(int d:deck) 
   	 map.put(d,map.getOrDefault(d,0)+1);
    for(int x:map.keySet())
   	 min=Math.min(min,map.get(x));
    if(min<=1) return false;
    for(int i=2;i<=min;i++)
    {
   	 boolean flag=true;
   	 for(int x:map.keySet())
   	 {
   		 if(map.get(x)%i!=0)
   		 {
   			 flag=false;
   			 break;
   		 }
   	 }
   	 if(flag)
   		 return true;
    }
    return false;
    }
}
