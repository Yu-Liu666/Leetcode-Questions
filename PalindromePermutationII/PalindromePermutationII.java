package PalindromePermutationII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromePermutationII {
//方法超时 要从字符数量上考虑
public List<String> generatePalindromes(String s) {
		char[] str=s.toCharArray();
		Arrays.sort(str);
		List<String> list=new ArrayList<>();
		backtracking(str,"",list,new boolean[s.length()]);
		return list;
    }
void backtracking(char[] s,String ans,List<String> list,boolean[] flag){
	if(ans.length()==s.length)
	{
		if(new StringBuilder(ans).reverse().toString().equals(ans))
			list.add(ans);
		return;
	}
	int pre=-1;
	for(int i=0;i<s.length;i++)
	{
		if(pre!=-1&&s[i]==s[pre]) continue;
		if(flag[i]) continue;
		pre=i;
		flag[i]=true;
		backtracking(s,ans+s[i],list,flag);
		flag[i]=false;
	}
}
}
