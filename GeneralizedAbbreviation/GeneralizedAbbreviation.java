package GeneralizedAbbreviation;

import java.util.ArrayList;
import java.util.List;

public class GeneralizedAbbreviation {

public List<String> generateAbbreviations(String word) {
	List<String> list=new ArrayList<>();
	backtracking(word,0,list,"");
	return list;
    }
void backtracking(String word,int pos,List<String> list,String s) {
	if(pos!=word.length())
		list.add(s+(word.length()-pos));
	else
		list.add(s);
	for(int i=pos;i<word.length();i++)
	{
		int dis=i-pos;
		if(i!=pos)
			backtracking(word,i+1,list,s+dis+word.charAt(i));
		else
			backtracking(word,i+1,list,s+word.charAt(i));
	}
}
}
