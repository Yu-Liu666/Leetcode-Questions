package DesignCompressedStringIterator;

public class StringIterator {

StringBuilder s;
int index=0;
int number=0;
char c=' ';
public StringIterator(String compressedString) {
	s=new StringBuilder(compressedString);
}
    public char next() {
        if(hasNext())
        {	
        	if(number>0) number--;
        	return s.charAt(c);
        }
        return ' '; 
    }
    
    public boolean hasNext() {
    	if(number>0) return true;
        if(index==s.length()) return false;
        if(Character.isDigit(s.charAt(index)))
        {
        	int sum=0;
        	while(index<s.length()&&Character.isDigit(s.charAt(index)))
        		sum=sum*10+s.charAt(index++)-'0';
        	number=sum;
        }
        else {
        	c=s.charAt(index);
        }
        
        return true;
    }
}
