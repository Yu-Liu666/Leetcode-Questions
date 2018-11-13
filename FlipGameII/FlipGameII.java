package FlipGameII;

public class FlipGameII {

public boolean canWin(String s) {
        return backtracking(s.toCharArray());
}

boolean backtracking(char[] str) {
	for(int i=0;i<=str.length-2;i++)
	{
		if(str[i]=='+'&&str[i+1]=='+')
		{
			str[i]='-';
			str[i+1]='-';
			if(!backtracking(str)) return true;
			str[i]='+';
			str[i+1]='+';
		}
	}
	return false;
}
}
