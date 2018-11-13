package BackspaceStringCompare;

import java.util.Stack;

public class BackspaceStringCompare {

	 public boolean backspaceCompare(String S, String T) {
	     return construct(S).equals(construct(T));
	    }

		String construct(String S) {
			StringBuilder s=new StringBuilder();
		     for(char c:S.toCharArray())
		     {
		    	 if(c=='#'&&s.length()>=1)
		    		 s.deleteCharAt(s.length()-1);
		    	 else if(c!='#')
	                 s.append(c);
		     }
	        System.out.println(s.toString());
		     return s.toString();
		}

}
