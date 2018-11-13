package KillProcess;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class KillProcess {

public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
	List<Integer> kills = new ArrayList<>();
	HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
	for(int i=0;i<ppid.size();i++)
	{
		if(!map.containsKey(ppid.get(i)))
			map.put(ppid.get(i),new ArrayList<Integer>());
		map.get(ppid.get(i)).add(pid.get(i));
	}
	dfs(kill,map,kills);
	return kills;
	
    }
void dfs(int n,HashMap<Integer,ArrayList<Integer>> map,List<Integer> kills) {
	kills.add(n);
	if(!map.containsKey(n)) return;
	for(int i=0;i<map.get(n).size();i++)
		dfs(map.get(n).get(i),map,kills);
}
}
