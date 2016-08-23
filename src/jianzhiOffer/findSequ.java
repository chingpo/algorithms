package jianzhiOffer;
import java.util.ArrayList;
import java.util.Comparator;


class findSequ{
	 public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		 ArrayList<ArrayList<Integer>> r=new ArrayList<ArrayList<Integer>> ();
		 int s=(int) Math.sqrt(2*sum);
		 for(int n=s;n>=2;n--){
			 double t= 2.0*sum/n+1-n;//注意不是int，不是2.0
	    	   if(t%2==0){
	    		   int a=(int) (t/2);
	    		   ArrayList<Integer> b = new ArrayList<Integer>();
	    		   for(int i=0;i<n;i++){
	    			   b.add(a+i);
	    		   }	    		  
	    		   r.add(b);	    		     		
	    	   }
	       } 
		 return r;
	    }
	public static void main(String[] args) {
		findSequ a=new findSequ();
		System.out.println(a.FindContinuousSequence(15));
	}
}
