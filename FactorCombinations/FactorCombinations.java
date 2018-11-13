package FactorCombinations;

import java.util.ArrayList;
import java.util.List;

public class FactorCombinations {

public List<List<Integer>> getFactors(int n) {
	List<List<Integer>> list=new ArrayList<>();
	backtracking(list,new ArrayList<>(),n);
	return list;
    }
void backtracking(List<List<Integer>> list,ArrayList<Integer> arr,int n) {
	
	if(judge(n)) {if(arr.size()!=0)list.add(new ArrayList<Integer>(arr)); return;}
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
			arr.add(i);
			backtracking(list,arr,n/i);
			arr.remove(arr.size()-1);
		}
	}
}

boolean judge(int n)
{
	if(n<=1) return false;
	if(n<=3) return true;
	for(int i=2;i<=Math.sqrt(n);i++)
		if(n%i==0)
			return false;
	return true;
}
}
