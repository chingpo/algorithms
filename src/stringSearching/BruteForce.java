package stringSearching;

import java.util.Scanner;
//暴力搜索
//设目标串String的长度为m，Pattern的长度为n，BF算法的时间复杂度最坏为O(mn)，效率很低
public class BruteForce {
	public static int bF(String a,String b){
		char[] p=a.toCharArray();//主串
		char[] s=b.toCharArray();//子串
		int i=0;
		int j=0;
		while(i<p.length&&j<s.length){
			if(p[i]==s[j]){//字符相同比较下一位
				i++;
				j++;
			}else{
				i=i-j+1;//不匹配主串移位子串归零
				j=0;
			}
		}
		if(j==s.length){
			return i-j;//成功，返回子串在主串中的第一个字符位置
		}else{
			return -1;
		}
	}
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    System.out.println("请输入主串：");
	    String p=sc.nextLine();
	    System.out.println("请输入子串：");
	    String s=sc.nextLine();
	    int i=bF(p,s);
	    System.out.println("子串在主串中的位置："+i);
	}

}
