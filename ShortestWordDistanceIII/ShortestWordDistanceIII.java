package ShortestWordDistanceIII;

public class ShortestWordDistanceIII {

public int shortestWordDistance(String[] words, String word1, String word2) {
     int pre=-1;
     String s="";
     int min=Integer.MAX_VALUE;
     for(int i=0;i<words.length;i++)
     {
    	 if(words[i].equals(word1)||words[i].equals(word2))
    	 {
    		 if(pre!=-1&&(word1.equals(word2)||!s.equals(words[i]))) {
    			 min=Math.min(min,i-pre);
    		 }
    		 pre=i;
    		 s=words[i];
    	 }
     }
     return min;
    }
}
