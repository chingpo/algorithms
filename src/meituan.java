import java.util.*;

//现在有一个城市销售经理，需要从公司出发
//，去拜访市内的商家，已知他的位置以及商家的位置，
//但是由于城市道路交通的原因，他只能在左右中选择一个方向，在上下中选择一个方
//向，现在问他有多少种方案到达商家地址。
//
//给定一个地图map及它的长宽n和m，其中1代表经理位置，2代表商家
//位置，-1代表不能经过的地区，0代表可以经过的地区，请返回方案数，保证一定存
//在合法路径。保证矩阵的长宽都小于等于10。
public class meituan {
	public static int getResult(int[][] arr,int n,int m){
		int x1=0,x2=0,y1=0,y2=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				if(arr[i][j]==1){y1=i;x1=j;}
				if(arr[i][j]==2){y2=i;x2=j;}
			}
		}
		if(x1==x2||y1==y2) return 1;
		int xto=x1>x2?-1:1;
		int yto=y1>y2?-1:1;
		for(int y=y1;y!=(y2+yto);y+=yto){
			for(int x=x1;x!=(x2+xto);x+=xto){
				if(y==y1||x==x1){
					arr[y][x]=1;
					continue;
				}
				arr[y][x]=arr[y-yto][x]+arr[y][x-xto];
			}
		}
		return arr[y2][x2];
	
		
	}
	public static void main(String[] args) {


		int[][] arr={{0,1,0},{2,0,0}};
		
			System.out.println(getResult(arr,2,3));
		
	}

}
//[[0,1,0],[2,0,0]],2,3