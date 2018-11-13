package ConvertaNumbertoHexadecimal;

public class ConvertaNumbertoHexadecimal {

public String toHex(int num) {
     char[] map= {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
     String s="";
     while(num>0)
     {
    	 s = map[num&15]+ s;
    	 num>>>=4;
     }
     return s;
    }
}
