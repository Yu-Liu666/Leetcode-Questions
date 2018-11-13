package BaseballGame;

import java.util.ArrayList;
import java.util.Stack;

public class Improve {

	public int calPoints(String[] ops) {
		 
		ArrayList<Integer> list=new ArrayList<>();
		 int sum=0;
		 for(String s:ops)
		 {
			 if(s.equals("C"))
			 {
				 if(list.size()>=1)
				 {
					 sum-=list.get(list.size()-1);
					 list.remove(list.size()-1);
				 }
			 }
			 else if(s.equals("D"))
			 {
				 if(list.size()>=1) 
				 {
					 int x1=list.get(list.size()-1);
					 list.add(x1*2);
					 sum+=x1*2;
				 }
			 }
			 else if(s.equals("+"))
			 {
				 if(list.size()>=2) {
					 
					 sum+=list.get(list.size()-1)+list.get(list.size()-2);
					 list.add(list.get(list.size()-1)+list.get(list.size()-2));
				 }
			 }
			 else {
				 list.add(Integer.parseInt(s));
				 sum+=Integer.parseInt(s);
			 }
		 }
		 return sum;
    }
}
