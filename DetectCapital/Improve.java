package DetectCapital;

public class Improve {

	public boolean detectCapitalUse(String word) {
		int count=0;
		for(int i=0;i<word.length();i++)
			if('Z'-word.charAt(i)>=0) count++;
		return (count==0)||(count==word.length())||(count==1&&word.charAt(0)<=90);
    }
}
