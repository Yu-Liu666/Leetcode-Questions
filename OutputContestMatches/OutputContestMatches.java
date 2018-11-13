package OutputContestMatches;

import java.util.ArrayList;

public class OutputContestMatches {

public String findContestMatch(int n) {
     ArrayList<String> list=new ArrayList<>();
     for(int i=1;i<=n;i++) list.add(i+"");
     n=list.size();
     while(n>1)
     {
    	 ArrayList<String> newlist=new ArrayList<>();
    	 for(int i=0;i<n/2;i++)
    		 newlist.add("("+list.get(i)+","+list.get(list.size()-i-1)+")");
    	 list=newlist;
    	 n/=2;
     }
     return list.get(0);
     
     
    }
}
