package ReverseWordsinaStringIII;

public class ReverseWordsinaStringIII {

	public String reverseWords(String s) {
		String[] strs=s.split(" ");
		String res="";
		for(int i=0;i<strs.length;i++)
		{
			res+=new StringBuilder(strs[i]).reverse().toString()+" ";
		}
		return res.substring(0,res.length()-1);
    }

}
