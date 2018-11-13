package GoatLatin;

public class GoatLatin {

	 public String toGoatLatin(String S) {
		 String[] strs=S.split(" ");
		 String res="";
		 String b="a";
		 for(int i=0;i<strs.length;i++)
		 {
			 
			 String temp="";
			 String end="ma";
			 int j=0;
			 if(!(strs[i].charAt(0)=='a'||strs[i].charAt(0)=='e'||strs[i].charAt(0)=='i'||strs[i].charAt(0)=='o'||strs[i].charAt(0)=='u'))
			 {	 end=strs[i].charAt(0)+end;
			     j=1;
			 }
			 for(;j<strs[i].length();j++)
				 temp+=strs[i].charAt(j);
			 temp+=end+b;
			 b+="a";
			 res+=temp+" ";
		 }
		 return res.substring(0,res.length()-1);
	    }
	 
}
