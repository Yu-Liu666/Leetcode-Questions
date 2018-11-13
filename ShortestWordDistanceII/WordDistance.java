package ShortestWordDistanceII;

import java.util.ArrayList;
import java.util.HashMap;

public class WordDistance {

	HashMap<String,ArrayList<Integer>> map;
	public WordDistance(String[] words) {
		map=new HashMap<>();
		for(int i=0;i<words.length;i++)
		{
			if(!map.containsKey(words[i]))
				map.put(words[i],new ArrayList<Integer>());
			map.get(words[i]).add(i);
		}
    }
    
    public int shortest(String word1, String word2) {
        ArrayList<Integer> list1=map.get(word1); 
        ArrayList<Integer> list2=map.get(word2);
        int i=0,j=0,min=Integer.MAX_VALUE;
        while(i<list1.size()&&j<list2.size())
        {
        	if(list1.get(i)<list2.get(j))
        	{	min=Math.min(min,list2.get(j)-list1.get(i));
        		i++;
        	}
        	else 
        	{	min=Math.min(min,list1.get(i)-list2.get(j));
    			j++;
        	}
        }
        return min;
    }
}
