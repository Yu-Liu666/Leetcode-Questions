package RomantoInteger;

import java.util.HashMap;

public class RomantoInteger {

public int romanToInt(String s) {
	
	HashMap<String,Integer> map=new HashMap<>();
	map.put("I",1);
	map.put("V",5);
	map.put("X",10);
	map.put("L",50);
	map.put("C",100);
	map.put("D",500);
	map.put("M",1000);
	map.put("IV",5);
	map.put("IX",10);
	map.put("XL",50);
	map.put("XC",100);
	map.put("CD",500);
	map.put("CM",1000);
	int res=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='I'||s.charAt(i)=='X'||s.charAt(i)=='C')
		{
			if(i+1<s.length()&&map.containsKey(""+s.charAt(i)+s.charAt(i+1)))
			{	
				res+=map.get(""+s.charAt(i)+s.charAt(i+1));
				i++;
			}	
		}
		else res+=map.get(""+s.charAt(i));
	}
	return res;
    }

}
