package AsteroidCollision;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Improve {

	public int[] asteroidCollision(int[] asteroids) {
	     List<Integer> list=new ArrayList<>();
	     for(int i=0;i<asteroids.length;i++)
	     {
	    	if(list.size()==0||asteroids[i]>0||list.get(list.size()-1)<0)
	    		list.add(asteroids[i]);
	    	else {
	    		if(list.get(list.size()-1)<=-asteroids[i])
	    		{	 int x=list.get(list.size()-1);
	    		list.remove(list.size()-1);
	    			if(x<-asteroids[i])
	    				i--;
	    		}		
	    	}
	     }
	     int[] ans=new int[list.size()];
	     for(int i=0;i<list.size();i++)
	    	 ans[i]=list.get(i);
	     return ans;  
	    }
}
