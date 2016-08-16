package dataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

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
	  //返回v1,v2的权值
    public int getWeight(int v1,int v2) {
        return edges[v1][v2];
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
  //私有函数，深度优先遍历
  private void depthFirstSearch(boolean[] isVisited,int  i) {
      //首先访问该结点，在控制台打印出来
      System.out.print(getValueByIndex(i)+"  ");
      //置该结点为已访问
      isVisited[i]=true;
      
      int w=getFirstNeighbor(i);//
      while (w!=-1) {
          if (!isVisited[w]) {
              depthFirstSearch(isVisited,w);
          }
          w=getNextNeighbor(i, w);
      }
  }
  
  //对外公开函数，深度优先遍历，与其同名私有函数属于方法重载
  public void depthFirstSearch() {
	  boolean[] isVisited=new boolean[getNumOfVex()];
      for(int i=0;i<getNumOfVex();i++) {
          
		//因为对于非连通图来说，并不是通过一个结点就一定可以遍历所有结点的。
          if (!isVisited[i]) {
        	 isVisited[i]=false; 
              depthFirstSearch(isVisited,i);
          }
      }
  }
  
  //私有函数，广度优先遍历
  private void broadFirstSearch(boolean[] isVisited,int i) {
      int u,w;
      LinkedList queue=new LinkedList();
      
      //访问结点i
      System.out.print(getValueByIndex(i)+"  ");
      isVisited[i]=true;
      //结点入队列
      queue.addLast(i);
      while (!queue.isEmpty()) {
          u=((Integer)queue.removeFirst()).intValue();
          w=getFirstNeighbor(u);
          while(w!=-1) {
              if(!isVisited[w]) {
                      //访问该结点
                      System.out.print(getValueByIndex(w)+"  ");
                      //标记已被访问
                      isVisited[w]=true;
                      //入队列
                      queue.addLast(w);
              }
              //寻找下一个邻接结点
              w=getNextNeighbor(u, w);
          }
      }
  }
  
  //对外公开函数，广度优先遍历
  public void broadFirstSearch() {
	  boolean[] isVisited=new boolean[getNumOfVex()];
      for(int i=0;i<getNumOfVex();i++) {
		if(!isVisited[i]) {
             isVisited[i]=false; 
             broadFirstSearch(isVisited, i);
          }
      }
  }

	 public static void main(String args[]) {
//	        int n=4,e=4;//分别代表结点个数和边的数目
//	        String labels[]={"V1","V1","V3","V4"};//结点的标识
//	        MGraph graph=new MGraph(n);
//	        for(String label:labels) {
//	            graph.insertVex(label);//插入结点
//	        }
//	        //插入四条边
//	        graph.insertEdge(0, 1, 2);
//	        graph.insertEdge(0, 2, 5);
//	        graph.insertEdge(2, 3, 8);
//	        graph.insertEdge(3, 0, 7);
//	     
//	        showGraph(graph.edges);
//	        System.out.println("结点个数是："+graph.getNumOfVex());
//	        System.out.println("边的个数是："+graph.getNumOfEdges());
//
//	        graph.deleteEdge(0, 1);//删除<V1,V2>边
//	        System.out.println("删除<V1,V2>边后...");
//	        System.out.println("结点个数是："+graph.getNumOfVex());
//	        System.out.println("边的个数是："+graph.getNumOfEdges());
//	        showGraph(graph.edges);
	        int n=8,e=9;//分别代表结点个数和边的数目
	        String labels[]={"1","2","3","4","5","6","7","8"};//结点的标识
	        MGraph graph=new MGraph(n);
	        for(String label:labels) {
	            graph.insertVex(label);//插入结点
	        }
	        //插入九条边
	        graph.insertEdge(0, 1, 1);
	        graph.insertEdge(0, 2, 1);
	        graph.insertEdge(1, 3, 1);
	        graph.insertEdge(1, 4, 1);
	        graph.insertEdge(3, 7, 1);
	        graph.insertEdge(4, 7, 1);
	        graph.insertEdge(2, 5, 1);
	        graph.insertEdge(2, 6, 1);
	        graph.insertEdge(5, 6, 1);
	        graph.insertEdge(1, 0, 1);
	        graph.insertEdge(2, 0, 1);
	        graph.insertEdge(3, 1, 1);
	        graph.insertEdge(4, 1, 1);
	        graph.insertEdge(7, 3, 1);
	        graph.insertEdge(7, 4, 1);
	        graph.insertEdge(6, 2, 1);
	        graph.insertEdge(5, 2, 1);
	        graph.insertEdge(6, 5, 1);
	        
	        System.out.println("深度优先搜索序列为：");
	        graph.depthFirstSearch();
	        System.out.println();
	        System.out.println("广度优先搜索序列为：");
	        graph.broadFirstSearch();
	    }
	    

}
