package jianzhiOffer;

public class mulVector {
	 public static int[] multiply(int[] A) {
	        int[] b=new int[A.length];
	        int[] temp1=new int[A.length];
	        int[] temp2=new int[A.length];
	        for(int m=0;m<b.length;m++){
	        	b[m]=1;
	        	temp1[m]=1;
	        	temp2[m]=1;
	        }
	        for(int k=0;k<A.length;k++){
	        	for(int i=0;i<k;i++){
	        		temp1[k]=A[i]*temp1[k];
	        }
	        	for(int j=k+1;j<A.length;j++){
	        		temp2[k]=A[j]*temp2[k];
	        	}
	        	b[k]=temp2[k]*temp1[k];
	        }
	        return b;
	    }
	 public static void main(String[] args) {
		int[] a={1,2,3,4};
		int[] b;
		b=multiply(a);
		for(int i=0;i<b.length;i++){
		System.out.println(b[i]);	
		}
		
	}

}
