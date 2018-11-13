package WordSubsets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WordSubsets {

public List<String> wordSubsets(String[] A, String[] B) {
	List<String> list=new ArrayList<>();
	HashMap<Character,Integer> map=new HashMap<>();
	for(String s:B)
	{
		int[] count=new int[26];
		for(int i=0;i<s.length();i++)
			count[s.charAt(i)-'a']++;
		for(int i=0;i<26;i++)
		{
			if(!map.containsKey((char)('a'+i)))
				map.put((char)('a'+i),count[i]);
			else {
				map.put((char)('a'+i),Math.max(count[i],map.get((char)('a'+i))));
			}
		}
	}
	
	for(String a:A)
	{
		int[] count=new int[26];
		boolean flag=true;
		for(int i=0;i<a.length();i++)
			count[a.charAt(i)-'a']++;
		for(int i=0;i<26;i++)
		{
			if(count[i]<map.get((char)('a'+i)))
			{
				flag=false;
				break;
			}
		}
		if(flag)
			list.add(a);
	}
	return list;
    }
}
