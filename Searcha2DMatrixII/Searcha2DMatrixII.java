package Searcha2DMatrixII;

public class Searcha2DMatrixII {

public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] a:matrix)
        {
        	if(bs(a,target)) return true;
        }
        return false;
    }

	boolean bs(int[] num,int target) {
		int i=0,j=num.length-1;
		while(i<=j)
		{
			int mid=i+(j-i)/2;
			if(num[mid]==target) return true;
			else if(num[mid]>target) j=mid-1;
			else i=mid+1;
		}
		return false;
	}
}
