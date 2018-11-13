package CountBinarySubstrings;

public class CountBinarySubstrings {

	public int countBinarySubstrings(String s) {
		int current=1;
		int pre=0;
		int res=0;
		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i)==s.charAt(i-1))
				current++;
			else {
				res+=Math.min(pre,current);
				pre=current;
				current=1;
			}
		}
		res+=Math.min(pre,current);
		return res;
    }
}
