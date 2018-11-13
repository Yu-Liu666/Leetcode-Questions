package XofaKindinaDeckofCards;

import java.util.HashMap;

public class Improve {

	public boolean hasGroupsSizeX(int[] deck) {
		HashMap<Integer, Integer> map=new HashMap<>();
		int res=0;
	    for(int d:deck) 
	   	 	map.put(d,map.getOrDefault(d,0)+1);
	    for(int val:map.values()) res=gcd(res,val);
	    return res>1;
	}
	
	int gcd(int a,int b)
	{
		int x=Math.min(a,b);
		int y=Math.max(a,b);
		while(y%x!=0)
		{
			int r=y%x;
			x=y;
			y=r;
		}
		return y;
	}
}
