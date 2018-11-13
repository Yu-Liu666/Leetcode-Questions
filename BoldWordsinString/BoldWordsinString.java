package BoldWordsinString;

public class BoldWordsinString {

public String boldWords(String[] words, String S) {
     boolean[] flag=new boolean[S.length()];
     for(String word:words)
     {
    	 int index=0;
    	 while(S.indexOf(word,index)>=0) {
    		 index=S.indexOf(word,index);
    		 for(int i=index;i<index+word.length();i++)
    			 flag[i]=true;
    		 index=index+word.length();
    		 if(index>=S.length()) break;
    	 }
     }
     StringBuilder s=new StringBuilder();
     for(int i=0;i<flag.length;i++)
     {
    	 if((i==0||flag[i-1]==false)&&flag[i])
    		 s.append("<b>");
    	 s.append(S.charAt(i));
    	 if((i==flag.length-1||flag[i+1]==false)&&flag[i])
    		 s.append("</b>");
     }
     return s.toString();
    }
}
