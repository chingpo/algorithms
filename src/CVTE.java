import java.util.Scanner;


public class CVTE {
	public static void find(int[] circle,int x,int n){
		int step=0;
		int cur=x;
		while(n!=0){
			int i=(cur+step)%circle.length;
			circle[i]=1;
			step+=1;
			n-=1;
			cur=(i+1)%circle.length;			
		}
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int x=in.nextInt();
			int n=in.nextInt();
			int[] circle=new int[20];
			
			 find(circle, x - 1, n);
			boolean k=false;
			for(int i=0;i<circle.length;i++){
				if(circle[i]!=1){
					System.out.print(i+1);
					System.out.print(" ");
					k=true;
				}
			}
			if(k){
				System.out.println();
			}else{
				System.out.println("-1");
			}
			
		}
		in.close();
	}

}
