
import java.util.*;

//动态规划 
//小东所在公司要发年终奖，而小东恰好获得了最高福利
//，他要在公司年会上参与一个抽奖游戏，游戏在一个6*6的棋盘上进行，
//上面放着36个价值不等的礼物，每个小的棋盘上面放置着一个礼物，他需要从左上
//角开始游戏，每次只能向下或者向右移动一步，到达右下角停止，一路上的格子里的礼
//物小东都能拿到，请设计一个算法使小东拿到价值最高的礼物。
//
//给定一个6*6的矩阵board，其中每个元素为对应格子的礼物价值,左上角
//为[0,0],请返回能获得的最大价值，保证每个礼物价值大于100小于1000
public class JD1 {
	 
		 public static int getResult(int [][] matrix) {
			 for(int i=0;i<matrix.length;i++){
				 for(int j=0;j<matrix[0].length;j++){
					 if(i==0&&j==0){
						
					 }else if(i==0){
						 matrix[i][j]+=matrix[i][j-1];
					 }else if(j==0){
						 matrix[i][j]+=matrix[i-1][j];
					 }else{
						 int tempup=matrix[i-1][j];
						 int templeft=matrix[i][j-1];
						 if(tempup>templeft){
							 matrix[i][j]+=tempup;
						 }else{
							 matrix[i][j]+=templeft;
						 }
					 }
				 }
				
			
			 }
			 
			return matrix[matrix.length-1][matrix[0].length-1];
			   
	
		      
	    }
	public static void main(String[] args) {
		int board[][]={
                {564 ,448 ,654 ,186 ,490 ,699},
                {487 ,444 ,563 ,228 ,365 ,261},
                {429 ,505 ,612 ,564 ,715 ,726},
                {464 ,617 ,234 ,647 ,702 ,263},
                {245 ,249 ,231 ,462 ,453 ,646},
                {669 ,510 ,492 ,512 ,622 ,135}
               };

               System.out.print(getResult(board));
	     
	        
		
    }
}


