package IsSubsequence;

public class M2 {

	public boolean isSubsequence(String s, String t) {
		if(s.equals("")) return true;
		int i=0,j=0;
		for(;j<t.length();j++)
		{	if(t.charAt(j)==s.charAt(i))
				i++;
			if(i==s.length()) return true;
		}
		
		return false;
    }
}
