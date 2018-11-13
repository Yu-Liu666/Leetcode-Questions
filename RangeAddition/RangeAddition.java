package RangeAddition;

public class RangeAddition {

public int[] getModifiedArray(int length, int[][] updates) {
     int[] arr=new int[length];
     for(int[] update:updates)
     {
    	 int s=update[0];
    	 int e=update[1];
    	 int in=update[2];
    	 for(int i=s;i<=e;i++)
    		 arr[i]+=in;
     }
     return arr;
    }
}
