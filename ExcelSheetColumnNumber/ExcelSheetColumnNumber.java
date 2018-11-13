package ExcelSheetColumnNumber;

public class ExcelSheetColumnNumber {

public int titleToNumber(String s) {
	 int count=0;
     for(int i=0;i<s.length();count=count*26+s.charAt(i)-'A'+1,i++);
     return count;
    }
}
