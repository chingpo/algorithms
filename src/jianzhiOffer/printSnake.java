package jianzhiOffer;

import java.util.ArrayList;

public class printSnake {
	public static ArrayList<Integer> printMatrix(int [][] matrix) {
	    int step[][] = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
	    int h = matrix.length, w = matrix[0].length;
	    ArrayList<Integer> re = new ArrayList<Integer>();
	    re.add(matrix[0][0]);
	    int[][] flag = new int[h][w];
	    flag[0][0]=1;
	    int count = 1, x = 0, y = 0;
	    for (int i = 0; count < w * h; i = (i + 1) % 4) {
	        int newx = x + step[i][0], newy = y + step[i][1];
	        while (newx >= 0 && newx < h && newy >= 0 && newy < w) {
	            if (flag[newx][newy] == 1) {
	                break;
	            }
	            int t = matrix[newx][newy];
	            count++;
	            flag[newx][newy] = 1;
	            re.add(t);
	            x = newx;
	            y = newy;
	            newx = x + step[i][0];
	            newy = y + step[i][1];
	        }
	    }
	    return re;  
	    }
	public static void main(String[] args) {
		int[][] a={
	    		{1,2,3},
	    		{4,5,6},
	    		{7,8,9}
	    	};
		 ArrayList<Integer> b=printMatrix(a);
		 for(int i=0;i<b.size();i++){
			 System.out.print(b.get(i));
		 }
	}

}
