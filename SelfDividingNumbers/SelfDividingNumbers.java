package SelfDividingNumbers;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

public List<Integer> selfDividingNumbers(int left, int right) {
	List<Integer> list=new ArrayList<>();
	for(int i=left;i<=right;i++)
		if(judge(i))
			list.add(i);
	return list;
    }
boolean judge(int n) {
	int temp=n;
	while(n>0)
	{
		int digit=n%10;
		if(digit==0||temp%digit!=0) return false;
		n/=10;
	}
	return true;
}
}
