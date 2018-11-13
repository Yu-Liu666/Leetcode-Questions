package IsSubsequence;

public class M3 {

	public boolean isSubsequence(String s, String t) {
		int i=0,j=0;
		while(i<s.length())
		{
			char c=s.charAt(i);
			int index=t.indexOf(c,j);
			if(index<0) return false;
			j=index+1;
			i++;
		}
		return true;
    }
}
