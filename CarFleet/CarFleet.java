package CarFleet;

import java.util.Map;
import java.util.TreeMap;

import javax.swing.text.Position;

public class CarFleet {

	 public int carFleet(int target, int[] pos, int[] speed) {
		 TreeMap<Integer,Double> map=new TreeMap<>();
		 for(int i=0;i<pos.length;i++)
			 map.put(-pos[i],((double)(target)-pos[i])/speed[i]);
		 double cur=0;
		 int res=0;
		 for(Map.Entry<Integer,Double> entry:map.entrySet())
		 {
			 if(entry.getValue()>cur)
			 {
				 res++;
				 cur=entry.getValue();
			 }
		 }
		 return res;
	 }
}
