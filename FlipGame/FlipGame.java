package FlipGame;

import java.util.ArrayList;
import java.util.List;

public class FlipGame {

public List<String> generatePossibleNextMoves(String s) {
	List<String> list=new ArrayList<>();
	for(int i=0;i<s.length()-1;i++) {
		if(s.substring(i,i+2).equals("++"))
		list.add(s.substring(0,i)+"--"+s.substring(i+2));
	}
	return list;
    }
}
