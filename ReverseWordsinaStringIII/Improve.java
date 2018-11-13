package ReverseWordsinaStringIII;

import java.util.Stack;

public class Improve {

	public String reverseWords(String s) {
		Stack<String> stack=new Stack<>();
		String temp="";
		String res="";
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)==' ')
			{
				stack.push(temp);
				temp="";
			}
			else {
				temp+=s.charAt(i);
			}
		}
		stack.push(temp);
		while(!stack.isEmpty())
			res+=stack.pop()+" ";
		return res.substring(0,res.length()-1);
	}
}
