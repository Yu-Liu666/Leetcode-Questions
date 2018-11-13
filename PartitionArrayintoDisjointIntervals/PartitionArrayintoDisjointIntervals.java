package PartitionArrayintoDisjointIntervals;

public class PartitionArrayintoDisjointIntervals {

public int partitionDisjoint(int[] A) {
     
	int max=Integer.MIN_VALUE;
	for(int i=0;i<A.length;i++) {   
		max=Math.max(max,A[i]);
		boolean flag=true;
		for(int j=i+1;j<A.length;j++)
		{
			if(A[j]>max)
			{
				flag=false;
				break;
			}
		}
		if(flag)
			return i+1;
    }
	return A.length;
    
}
}
