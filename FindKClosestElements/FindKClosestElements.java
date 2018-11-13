package FindKClosestElements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindKClosestElements {

	 public List<Integer> findClosestElements(int[] arr, int k, int x) {
	     List<Integer> list=new ArrayList<>();
	     int index=bs(arr,x);
	     int left=index-1,right=index;
	     while(k>0)
	    	 {
	    	    boolean flag=true;
	    		if(left>=0&&right<arr.length) {
	    			 if(x-arr[left]>arr[right]-x)
	    				flag=false;
	    		 }
	    	    else if(right<arr.length){
	    			flag=false; 
	    		 }
	    		if(flag) {
	    			 list.add(arr[left--]);
	    			 k--;
	    		}
	    		else {
	    			list.add(arr[right++]);
	    			 k--;
	    		}
	    	 }
	    	 Collections.sort(list);
	     return list;
	    }

	int bs(int[] arr,int x)
	{
		int lo=0,hi=arr.length-1;
	    while(lo<=hi)
	    {
	    	int mid=lo+(hi-lo)/2;
	    	if(arr[mid]==x) return mid;
	    	else if(arr[mid]>x) hi=mid-1;
	    	else lo=mid+1;
	    }
	    return lo;
	}

}
