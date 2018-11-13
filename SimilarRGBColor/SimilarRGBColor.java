package SimilarRGBColor;

public class SimilarRGBColor {

	public String similarRGB(String color) {
        if(color.length()==4) return color;
        StringBuilder str=new StringBuilder();
        str.append("#");
        for(int i=1;i<color.length()-1;i+=2){
            String s=color.substring(i,i+2);
            str.append(translate(s));
        }
        return str.toString();
    }
	
	String translate(String color) {
		int c1=Character.isDigit(color.charAt(0))?color.charAt(0)-'0':color.charAt(0)-'a'+10;
		int c2=Character.isDigit(color.charAt(1))?color.charAt(1)-'0':color.charAt(1)-'a'+10;
		int num=c1*16+c2;
		int index=num/17;
		int remain=num%17;
		if(remain>17/2)
			index++;
		if(index>=0&&index<=9) return ""+index+index;
		else return ""+String.valueOf((char)((int)(index-10)+'a'))+String.valueOf((char)((int)(index-10)+'a'));
	}
}
