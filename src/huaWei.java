import java.util.ArrayList;
import java.util.Scanner;


public class huaWei {

	public static void getResult(String flag, int a, int b, int[] score){
		
		if(flag.equals("Q")){
			int minIndex=Math.min(a, b)-1;
			int maxIndex=Math.max(a, b);
			int temp=score[minIndex];
			for(int i=minIndex+1;i<maxIndex;i++){
				temp=Math.max(temp, score[i]);
			}
			 System.out.println(temp);
		}else if(flag.equals("U")){
			score[a-1]=b;
		}
		
		
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int n=in.nextInt();
			int m=in.nextInt();
			int[] a=new int[n];
			for(int i=0;in.hasNext() &&i<n;i++){
				a[i]=in.nextInt();
			}			
            for(int j=0;in.hasNext() &&j<m;j++){
            	String b=in.next();
            	int A=in.nextInt();
            	int B=in.nextInt();
            	getResult(b,A,B,a);          	
			}	         	
		}
	
	}

}



