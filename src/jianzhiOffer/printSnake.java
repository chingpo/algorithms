package jianzhiOffer;

import java.util.ArrayList;
//最朴素无华的思路       待改进    
public class printSnake {
	public static ArrayList<Integer> printMatrix(int [][] matrix) {
		ArrayList<Integer> re=new ArrayList<>();
		int h = matrix.length, w = matrix[0].length,circle=0;
		int len=Math.min(h, w);
		if(len%2==1){
			circle=len/2+1;
		}else{
			circle=len/2;
		}
		for(int k=0;k<circle;k++){
			int i=k,j;
			for(j=k;j<w-k;j++){
				re.add(matrix[i][j]);
			}
			j=w-1-k;
			for(i=k+1;i<h-k;i++){
				re.add(matrix[i][j]);
			}
			i=h-1-k;
			for(j=j-1;j>k;j--){
				re.add(matrix[i][j]);
			}
			for(;i>k;i--){
				re.add(matrix[i][j]);
			}
	    
		}
		
	    return re;  
	    }
	public static void main(String[] args) {
		int[][] a={
	    		{1,2},
	    		{3,4},
	    		{5,6},
	    		{7,8}
	    	};
		 ArrayList<Integer> b=printMatrix(a);
		 for(int i=0;i<b.size();i++){
			 System.out.print(b.get(i));
		 }
	}

}
