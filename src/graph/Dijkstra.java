package graph;

import java.util.Arrays;

public class Dijkstra {
public static void main(String[] args) {
	int n=4;
	int[][] graph={
			{0,1,5,3}, 
			{1,0,4,1},
			{5,4,0,1},
			{3,1,1,0}
	};
	System.out.println(getResult(graph,n));
	
}

private static int getResult(int[][] graph, int n) {
	int[] dis=new int[n];
	Arrays.fill(dis, 0);
	int[] pre=new int[n];
	Arrays.fill(pre, 0);
	boolean[] flag=new boolean[n];
	Arrays.fill(flag, false);
	flag[0]=true;
	int k=0;
	for(int i=0;i<n;i++){
		dis[i]=graph[k][i];
	}
	for(int i=0;i<n-1;i++){
	int min=Integer.MAX_VALUE;	
	for(int j=0;j<n;j++){
		if(dis[j]<min&&!flag[j]){
			min=dis[j];
			k=j;
		}
		if(k==0) break;
		flag[k]=true;
		for(int m=0;m<n;m++){
			if(dis[m]>dis[k]+graph[k][m]){
				dis[m]=dis[k]+graph[k][m];
			
			}
				
		}
	}
	}
	
	
	int count=0;
	for(int i=0;i<n;i++){
		count+=dis[i];
	}
	return count;
	
	
	
	

}
}
