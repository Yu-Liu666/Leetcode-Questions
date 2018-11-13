package KeysandRooms;

import java.util.HashSet;
import java.util.List;

public class KeysandRooms {

	 public boolean canVisitAllRooms(List<List<Integer>> rooms) {
	 
		 HashSet<Integer> set=new HashSet<>();
		 dfs(0,rooms,set);
		 return set.size()==rooms.size();
	 }
	 
	 void dfs(int n,List<List<Integer>> rooms,HashSet<Integer> set) {
		 if(set.contains(n))
			 return;
		 set.add(n);
		 for(int i=0;i<rooms.get(n).size();i++)
			 dfs(rooms.get(n).get(i),rooms,set);
	 }
	 
	 
}
