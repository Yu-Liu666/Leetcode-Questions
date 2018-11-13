package FindPermutation;

public class FindPermutation {

public int[] findPermutation(String s) {
     
	int[] ans=new int[s.length()+1];
	for(int i=0;i<ans.length;i++)
		ans[i]=i+1;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='D')
		{
			int l=i;
			while(i<s.length()&&s.charAt(i)=='D') i++;
			reverse(ans,l,i);
		}
	}
	return ans;
     
    }

void reverse(int[] ans,int i,int j) {
	while(i<j)
	{
		int temp=ans[i];
		ans[i]=ans[j];
		ans[j]=temp;
		i++;
		j--;
	}
}
}
