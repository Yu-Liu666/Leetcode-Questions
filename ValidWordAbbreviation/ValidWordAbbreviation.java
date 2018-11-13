package ValidWordAbbreviation;

public class ValidWordAbbreviation {

	 public boolean validWordAbbreviation(String word, String abbr) {
		 int i=0,j=0;
		 while(i<word.length()&&j<abbr.length())
		 {
			 if(Character.isDigit(abbr.charAt(j)))
			 {
				 int count=0;
				 while(j<abbr.length()&&Character.isDigit(abbr.charAt(j)))
					 count=count*10+abbr.charAt(j)-'0';
				 i=i+count;
			 }
			 else {
				 if(word.charAt(i++)!=abbr.charAt(j++))
					 return false;
			 }
		 }
		 return i==word.length()&&j==abbr.length();
	 }
}
