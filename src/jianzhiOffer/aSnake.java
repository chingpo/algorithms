package jianzhiOffer;

import java.util.ArrayList;

//蛇形矩阵是由1开始的自然数依次排列成的一个矩阵上三角形
//四、蛇形矩阵
//描述:  蛇形矩阵是由1开始的自然数依次排列成的一个矩阵上三角形。
//
//输入
//正整数N（N不大于100）
//输出
//输出一个N行的蛇形矩阵。
//样例输入：5
//样例输出：
//1   3   4  10
//2   5   9  11
//6   8  12  15
//7  13  14  16
//

public class aSnake {
	public static ArrayList<Integer> getResult(int n){
		
		
		return null;
		
	}
	public static void main(String[] args) {
		int n=5;
		 ArrayList<Integer> b=getResult(n);
		 for(int i=0;i<b.size();i++){
			 System.out.print(b.get(i));
		 }
	}

}
