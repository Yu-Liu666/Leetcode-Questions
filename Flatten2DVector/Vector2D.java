package Flatten2DVector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Vector2D {

     ArrayList<Iterator<Integer>> list;
	 public Vector2D(List<List<Integer>> vec2d) {
		 list=new ArrayList<>();
		 for(int i=0;i<vec2d.size();i++)
			 list.add(vec2d.get(i).iterator());
	 }

	 public Integer next() {
	     int t=list.get(0).next();
	     if(!list.get(0).hasNext()) list.remove(0);
	     return t;
	 }

	 public boolean hasNext() {
	     return list.size()>0;
	 }
}
