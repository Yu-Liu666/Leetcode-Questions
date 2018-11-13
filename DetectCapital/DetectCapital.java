package DetectCapital;

public class DetectCapital {

	public boolean detectCapitalUse(String word) {
		if(word.toLowerCase().equals(word)||word.toUpperCase().equals(word)||word.length()<=1)
			return true;
		if(word.charAt(0)<97&&word.substring(1).toLowerCase().equals(word))
			return true;
		return false;
    }
}
