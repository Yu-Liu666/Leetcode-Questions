package ValidWordSquare;

import java.util.List;

public class ValidWordSquare {

public boolean validWordSquare(List<String> words) {
	
	if(words.size()!=words.get(0).length()) return false;
	for(int i=0;i<words.size();i++)
	{
		for(int j=0;j<words.get(i).length();j++)
		{	
			if(j>=words.size()||i>=words.get(i).length()) return false;
			if(words.get(i).charAt(j)!=words.get(j).charAt(i))
				return false;
		}
		
	}
	return true;
	
    }
}
