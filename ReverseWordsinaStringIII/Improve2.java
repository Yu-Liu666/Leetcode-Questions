package ReverseWordsinaStringIII;

import java.util.Stack;

public class Improve2 {

	public String reverseWords(String s) {
		char[] chars=s.toCharArray();
		for(int i=0;i<chars.length;i++)
		{
			if(chars[i]==' ') continue;
			int j=i;
			while(j+1<chars.length&&chars[j+1]!=' ') j++;
			reverse(chars,i,j);
			i=j;
		}
		return new String(chars);
	}
	
	void reverse(char[] chars,int s,int e)
	{
		while(s<e)
		{
			char temp=chars[s];
			chars[s]=chars[e];
			chars[e]=temp;
			s++;
			e--;
		}
	}
}
