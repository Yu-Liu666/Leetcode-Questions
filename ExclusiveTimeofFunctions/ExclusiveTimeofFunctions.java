package ExclusiveTimeofFunctions;

import java.util.List;
import java.util.Stack;

public class ExclusiveTimeofFunctions {

public int[] exclusiveTime(int n, List<String> logs) {
   
	Stack<int[]> stack=new Stack<>();
	int[] ans=new int[n]; 
    int pre=0;
	for(String log:logs)
	{
		String[] strs=log.split("\\:");
		if(!stack.isEmpty()) ans[stack.peek()[0]]+=Integer.parseInt(strs[2])-pre;
		pre=Integer.parseInt(strs[2]);
		if(strs[1].equals("start"))
			stack.push(new int[]{Integer.parseInt(strs[0]),Integer.parseInt(strs[2])});
		else
		{
			ans[stack.pop()[0]]++;
			pre++;
		}
	}
	return ans;
    }
}
