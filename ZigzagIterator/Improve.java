package ZigzagIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Improve {

	  List<Iterator<Integer>> list;
	  public Improve(List<Integer> v1, List<Integer> v2) {
		  list=new ArrayList<Iterator<Integer>>();
		  if(!v1.isEmpty()) list.add(v1.iterator());
		  if(!v2.isEmpty()) list.add(v2.iterator());
	  }

	  public int next() {
	      Iterator<Integer> temp=list.get(0);
	      list.remove(0);
	      int a=temp.next();
	      if(temp.hasNext())
	    	  list.add(temp);
	      return a;
	  }

	  public boolean hasNext() {
	      if(list.size()==0) return false;
	      return true;
	  }
}
