package MaximumDistanceinArrays;

import java.util.ArrayList;
import java.util.List;

public class MaximumDistanceinArrays {

public int maxDistance(List<List<Integer>> arrays) {
	int dis=Integer.MIN_VALUE;
	int max=arrays.get(0).get(arrays.get(0).size()-1);
	int min=arrays.get(0).get(0);
	for(int i=1;i<arrays.size();i++)
	{
		dis=Math.max(Math.abs(arrays.get(i).get(0)-max),dis);
		dis=Math.max(Math.abs(arrays.get(i).get(arrays.size()-1)-min),dis);
		max=Math.max(max,arrays.get(i).get(arrays.size()-1));
		min=Math.min(min,arrays.get(i).get(0));
	}
	return dis;
  }
}
