import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
class Test{
	 public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		 ArrayList<ArrayList<Integer>> r=new ArrayList<ArrayList<Integer>> ();
		 for(int n=2;n<Math.sqrt(2*sum);n++){
	    	   if((2*sum/n+1-n)%2==0){
	    		   int a=(2*sum/n+1-n)/2;
	    		   ArrayList<Integer> b = new ArrayList<Integer>();
	    		   for(int i=0;i<n;i++){
	    			   b.add(a+i);
	    		   }
	    		   r.add(b);
	    	   }
	       }
		 Collections.sort (r);
		 return r;
	    }
	public static void main(String[] args) {
		Test a=new Test();
		int[] b={1,1,1,1,2,3,4,5};
		int c=1;
		System.out.println(a.FindContinuousSequence(100));
	}
}