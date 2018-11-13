package Heaters;

import java.util.Arrays;

public class Heaters {

public int findRadius(int[] houses, int[] heaters) {
     int max=0;
     Arrays.sort(heaters);
     for(int house:houses)
     {
    	 int index=Arrays.binarySearch(heaters,house);
    	 int dis=0;
    	 if(index<0)
    	 {
    		 index=Math.abs(index+1);
    		 int left=index==0?Integer.MAX_VALUE:house-heaters[index-1];
    		 int right=index==heaters.length?Integer.MAX_VALUE:heaters[index]-house;
    		 dis=Math.min(left,right);
    	 }
    	 max=Math.max(dis,max);
     }
     return max;
    }
}
