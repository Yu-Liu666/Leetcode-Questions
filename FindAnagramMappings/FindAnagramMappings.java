package FindAnagramMappings;

import java.util.ArrayList;
import java.util.HashMap;

public class FindAnagramMappings {

public int[] anagramMappings(int[] A, int[] B) {
		
		int[] ans=new int[A.length];
		HashMap<Integer, ArrayList<Integer>> map=new HashMap<>();
		for(int i=0;i<A.length;i++)
		{
			if(!map.containsKey(A[i]))
				map.put(A[i],new ArrayList<Integer>());
			map.get(A[i]).add(i);
		}
		for(int i=0;i<B.length;i++)
		{
			ans[map.get(B[i]).get(0)]=B[i];
			map.get(B[i]).remove(0);
		}
		return ans;	
	}
}
