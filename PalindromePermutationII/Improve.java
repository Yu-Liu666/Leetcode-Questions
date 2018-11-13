package PalindromePermutationII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Improve {

	public List<String> generatePalindromes(String s) {
		int[] state=new int[256];
		int count=0;
		int j=-1;
		for(int i=0;i<s.length();i++)
			state[s.charAt(i)]++;
		for(int i=0;i<256;i++)
		{
			if(count!=0&&state[i]%2==1)
				return new ArrayList<>();
			else if(count==0&&state[i]%2==1)
			{	count++;
				j=i;
			}
		}
		String sss="";
		if(j!=-1) {state[j]--;sss=(char)j+"";}
		List<String> list=new ArrayList<>();
		backtracking(state,sss,list,new boolean[s.length()],s.length());
		return list;
    }
void backtracking(int[] state,String s,List<String> list,boolean[] flag, int total){
	if(s.length()==total)
	{
		list.add(s);
		return;
	}
	for(int i=0;i<state.length;i++)
	{
		if(state[i]<=0) continue;
		state[i]-=2;
		backtracking(state,(char)i+s+(char)i,list,flag,total);
		state[i]+=2;
	}
}
}
