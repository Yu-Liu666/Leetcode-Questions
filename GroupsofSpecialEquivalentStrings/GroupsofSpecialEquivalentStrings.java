package GroupsofSpecialEquivalentStrings;

import java.util.Arrays;
import java.util.HashSet;

public class GroupsofSpecialEquivalentStrings {

	public int numSpecialEquivGroups(String[] A) {
		
		HashSet<String> set=new HashSet<>();
		for(int i=0;i<A.length;i++)
		{
			int[] odd=new int[26];
			int[] even=new int[26];
			for(int j=0;j<A[i].length();j++)
			{
				if(j%2==0) even[A[i].charAt(j)-'a']++;
				else odd[A[i].charAt(j)-'a']++;
			}
			set.add(Arrays.toString(odd)+Arrays.toString(even));
		}
		return set.size();
    }

	public static void main(String[] args)
	{
		
	}
}
