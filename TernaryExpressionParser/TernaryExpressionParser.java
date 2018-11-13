package TernaryExpressionParser;

import java.util.Stack;

public class TernaryExpressionParser {

public String parseTernary(String expression) {
	Stack<Character> content=new Stack<>();
	for(int i=expression.length()-1;i>=0;i--)
	{
		if(!content.isEmpty()&&content.peek()=='?')
		{
			content.pop();
			char c1=content.pop();
			content.pop();
			char c2=content.pop();
			if(expression.charAt(i)=='T') content.push(c1);
			else content.push(c2);
		}
		else
			content.push(expression.charAt(i));
	}
	return content.peek()+"";
    }
}
