package dataStructure;

import java.util.ArrayList;
import java.util.Arrays;

//图的存储结构-邻接矩阵
public class MGraph {
	private ArrayList vex;//存储点
	private  int[][] edges;//边
	private int numOfEdges;//边的数目
	public MGraph(int n){
		edges=new int[n][n];
		vex=new ArrayList(n);
		numOfEdges=0;
	}
	public int getNumOfVex(){
		return vex.size();
	}
	public int getNumOfEdges(){
		return numOfEdges;
	}
	public Object getValueByIndex(int i){
		return vex.get(i);
	}
	 public void insertVex(Object vertex) {
	        vex.add(vex.size(),vertex);
	    }
	//插入结点
    public void insertEdge(int v1,int v2,int weight) {
        edges[v1][v2]=weight;
        numOfEdges++;
    }

    //删除结点
    public void deleteEdge(int v1,int v2) {
        edges[v1][v2]=0;
        numOfEdges--;
    }

    //得到第一个邻接结点的下标
    public int getFirstNeighbor(int index) {
        for(int j=0;j<vex.size();j++) {
            if (edges[index][j]>0) {
                return j;
            }
        }
        return -1;
    }

    //根据前一个邻接结点的下标来取得下一个邻接结点
    public int getNextNeighbor(int v1,int v2) {
        for (int j=v2+1;j<vex.size();j++) {
            if (edges[v1][j]>0) {
                return j;
            }
        }
        return -1;
    }
  public static void showGraph(int[][] edge){
	  for(int i=0;i<edge.length;i++){
		  System.out.println();
		  for(int j=0;j<edge[0].length;j++){
			  System.out.print(edge[i][j]);
		  }
		  System.out.println();
	  }
	  
  }
	 public static void main(String args[]) {
	        int n=4,e=4;//分别代表结点个数和边的数目
	        String labels[]={"V1","V1","V3","V4"};//结点的标识
	        MGraph graph=new MGraph(n);
	        for(String label:labels) {
	            graph.insertVex(label);//插入结点
	        }
	        //插入四条边
	        graph.insertEdge(0, 1, 2);
	        graph.insertEdge(0, 2, 5);
	        graph.insertEdge(2, 3, 8);
	        graph.insertEdge(3, 0, 7);
	     
	        showGraph(graph.edges);
	        System.out.println("结点个数是："+graph.getNumOfVex());
	        System.out.println("边的个数是："+graph.getNumOfEdges());

	        graph.deleteEdge(0, 1);//删除<V1,V2>边
	        System.out.println("删除<V1,V2>边后...");
	        System.out.println("结点个数是："+graph.getNumOfVex());
	        System.out.println("边的个数是："+graph.getNumOfEdges());
	        showGraph(graph.edges);
	    }

}
