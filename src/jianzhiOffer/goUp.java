package jianzhiOffer;

public class goUp {
	 public static int countWays(int n) {
	        if(n==1) return 0;
	        else if(n==2) return 2;
	        else{
	        	int f1=0;
	        	int f2=2;
	        	int f=f1+f2;
	        	for(int i=3;i<n;i++){
	        		f1=f2;
	        		f2=f;
	        		f=(f1+f2)%1000000007;
	        		
	        	}
	        	return f;
//	        	int[] s=new int[1000];
//	        	s[1]=0;s[2]=2;
//	        	for(int i=3;i<=n;i++){
//	        		s[i]=(s[i-2]+s[i-1])%1000000007;
//	        	}
//	        	return s[n];
	        	//return countWays(n-1)+countWays(n-2)%1000000007;
	        }
	            
	      
	        
	    }
	 public static void main(String[] args) {
		System.out.println(countWays(88));
	}
}
