package stringSearching;

import java.util.Scanner;


public class BoyerMoore
{
	/**
	        * 计算滑动距离
   	       * @param c 主串（源串）中的字符
	       * @param T 模式串（目标串）字符数组
	       * @param noMatchPos 上次不匹配的位置
	       * @return 滑动距离
	       */
	private static int dist(char c,char T[],int noMatchPos){
		int n=T.length;
		for(int i=noMatchPos;i>=1;i--){
			if(T[i-1]==c){
				return n-i;
			}
		}
		return n;
	}
	public static int bM(String a,String b){
		char[] p=a.toCharArray();//主串
		char[] s=b.toCharArray();//子串
		int i=s.length;
		int j=-1;
		while(i<=p.length){
			j=s.length;
			while(j>0&&p[i-1]==s[j-1]){
				i--;
				j--;
			}
			if(j==0){
				return i;
			}else{
				i=i+dist(p[i-1],s,j-1);
			}
		}
		return -1;
		
	}
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    System.out.println("请输入主串：");
	    String p=sc.nextLine();
	    System.out.println("请输入子串：");
	    String s=sc.nextLine();
	    int i=bM(p,s);
	    System.out.println("子串在主串中的位置："+i);
	}
}

