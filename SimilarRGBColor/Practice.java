package SimilarRGBColor;

public class Practice {

	 public String similarRGB(String color) {
		 String[] map= {"00","11","22","33","44","55","66","77","88","99","aa","bb","cc","dd","ee","ff"};
		 StringBuilder s=new StringBuilder();
		 s.append("#");
		 for(int i=1;i<color.length();i=i+2)
			 s.append(getColor(color.substring(i,i+2),map));
		 return s.toString();
	 }
	 
	 String getColor(String c,String[] map) {
		 int left=Character.isDigit(c.charAt(0))?c.charAt(0)-'0':10+c.charAt(0)-'a';
		 int right=Character.isDigit(c.charAt(1))?c.charAt(1)-'0':10+c.charAt(1)-'a';
		 int num=left*16+right;
		 int index=num/17;
		 int remain=num%17;
		 if(remain>17/2)
			 index++;
		 return map[index];
	 }
}
