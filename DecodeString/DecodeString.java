package DecodeString;

import java.util.Stack;

public class DecodeString {

public String decodeString(String s) {
     Stack<Integer> count=new Stack<>();
     Stack<String> str=new Stack<>();
     String res="";
     int i=0;
     while(i<s.length()) {
    	 if(Character.isDigit(s.charAt(i)))
    	 {
    		 int cont=0;
    		 while(i<s.length()&&Character.isDigit(s.charAt(i)))
    		 {	 cont=cont*10+s.charAt(i)-'0';
    		 	 i++;
    		 }
    		 count.push(cont);
    	 }
    	 else if(s.charAt(i)=='[')
    	 {
    		 str.push(res);
    		 res="";
    		 i++;
    	 }
    	 else if(s.charAt(i)==']')
    	 {
    		 int repeat=count.pop();
    		 String temp=str.pop();
    		 for(int j=0;j<repeat;j++)
    			 temp+=res;
    		 res=temp;
    		 i++;
    	 }
    	 else
    		 res+=s.charAt(i++);
     }
     return res;
}
}
