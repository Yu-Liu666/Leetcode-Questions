package BrickWall;

import java.util.HashMap;
import java.util.List;

public class BrickWall {

public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        for(List<Integer> w:wall)
        {
        	int loc=0;
        	for(int i=0;i<w.size()-1;i++)
        	{
        		loc+=w.get(i);
        		map.put(loc,map.getOrDefault(loc,0)+1);
        		max=Math.max(map.get(loc),max);
        	}
        }
        return wall.size()-max;
    }
}
