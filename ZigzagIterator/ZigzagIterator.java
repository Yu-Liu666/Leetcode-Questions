package ZigzagIterator;

import java.util.ArrayList;
import java.util.List;

public class ZigzagIterator {

	  int i, j;
	  List<Integer> v1, v2;
	  boolean flag;
	  public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
	      i=0;
	      j=0;
	      this.v1=v1;
	      this.v2=v2;
	      flag=true;
	  }

	  public int next() {
	      if(hasNext())
	      {
	    	 if(i<v1.size()&&j==v2.size())
	    		 return v1.get(i++);
	    	 if(j<v2.size()&&i==v1.size())
	    		 return v2.get(j++);
	    	 if(flag)
	    	 { flag=!flag;
	    		 return v1.get(i++);
	    	 } 
	    	 else
	    	 {
	    		 flag=!flag;
	    		 return v2.get(j++);
	    	 }
	      }
	      else
	    	  return -1;
	  }

	  public boolean hasNext() {
	      if(i<v1.size()||j<v2.size())
	    	  return true;
	      return false;
	  }
}
