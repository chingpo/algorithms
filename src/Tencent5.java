import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


public class Tencent5 {
	public static int getValue(int[] gifts, int n) {
		HashMap<Integer,Integer> a=new HashMap<>();
		for(int i=0;i<n;i++){
			if(a.containsKey( gifts[i])){
				int k=a.get(gifts[i]);
				k++;
				a.put(gifts[i], k);
			}else{
				a.put(gifts[i], 1);
			}
		}
		Iterator it = a.keySet().iterator();
		int max=0;int re=0;
		while (it.hasNext()) {
		int key = (int) it.next();
		int val = a.get(key);
		if(val>max){
			max=val;
			if(max>n/2){
				re=key;
			}else re=0;
			
		}
		
		}
		return re;
        // write code here
    }
	public static void main(String[] args) {
		int[] a={1,2,3,2,2};
		System.out.println(getValue(a,5));
	}
}
