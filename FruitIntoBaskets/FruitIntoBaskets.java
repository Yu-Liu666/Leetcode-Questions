package FruitIntoBaskets;

import java.util.HashMap;

public class FruitIntoBaskets {

public int totalFruit(int[] tree) {
	 HashMap<Integer,Integer> map=new HashMap<>();
     int s=0; int e=0;
 int max=1;
 int f1=-1;
 int f2=-1;
 while(e<tree.length)
 {
	 if(f1==-1) {map.put(tree[e],1);f1=tree[e];}
	 else if(tree[e]==f1) map.put(f1,map.get(f1)+1);
	 else if(f2==-1) {map.put(tree[e],1);f2=tree[e];}
	 else if(tree[e]==f2) map.put(f2,map.get(f2)+1);
	 else {
		 while(s<e)
		 {
			 map.put(tree[s],map.get(tree[s])-1);
			 if(map.get(tree[s])==0) {
                 map.remove(tree[s]);
				 if(tree[s]==f1) {
					 f1=f2;
				 }
				 f2=tree[e];
				 s++;
				 break;
				 }
			 s++;
         }
         
         map.put(tree[e],1);
     }
	 max=Math.max((f1!=-1?map.get(f1):0)+(f2!=-1?map.get(f2):0),max);
     e++;
 }
 return max;
    }
}
