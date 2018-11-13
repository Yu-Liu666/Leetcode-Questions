package ShortestWordDistance;

public class ShortestWordDistance {

public int shortestDistance(String[] words, String word1, String word2) {
     int i=-1,j=-1;
     int min = Integer.MAX_VALUE;
     for(int k=0;k<words.length;k++) {
    	 if(words[k].equals(word1)) {
    		 if(j!=-1)
    			 min=Math.min(min,k-j);
    		 i=k;
    	 }
    	 if(words[k].equals(word2)) {
    		 if(i!=-1)
    			 min=Math.min(min,k-i);
    		 j=k;
    	 }
     }
     return min;
    }
}
