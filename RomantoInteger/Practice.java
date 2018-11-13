package RomantoInteger;

import java.util.HashMap;

public class Practice {

	public int romanToInt(String s) {
		HashMap<String,Integer> map=new HashMap<>();
		map.put("I",1);
		map.put("V",5);
		map.put("X",10);
		map.put("L",50);
		map.put("C",100);
		map.put("D",500);
		map.put("M",1000);
		map.put("IV",4);
		map.put("IX",9);
		map.put("XL",40);
		map.put("XC",90);
		map.put("CD",400);
		map.put("CM",900);
		int res=0;
		for(int i=0;i<s.length();i++)
		{
			if(i+1<s.length()&&map.containsKey(s.substring(i,i+2)))
			{
				res+=map.get(s.substring(i,i+2));
				i++;
			}
			else res+=map.get(""+s.charAt(i));
		}
		return res;
	}
}
