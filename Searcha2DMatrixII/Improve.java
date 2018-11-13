package Searcha2DMatrixII;

public class Improve {

	public boolean searchMatrix(int[][] matrix, int target) {
		if(matrix.length==0) return false;
		int row=0,col=matrix[0].length-1;
		while(row<matrix.length&&col>=0)
		{
			if(matrix[row][col]==target) return true;
			if(target>matrix[row][col]) row++;
			else col--;
		}
		return false;
	}
}