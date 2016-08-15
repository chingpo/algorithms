package stringSearching;

import java.util.Scanner;

//KMP算法是一种改进的字符串匹配算法，关键是利用匹配失
//败后的信息，尽量减少模式串与主串的匹配次数以达到快速匹配的目的。
//在BF算法的基础上使用next函数（最大的相同的前后缀的字符数量）来找出下一次目标函数与Pattern
//比较的位置，因为BF算法每次移动一位的比较是冗余的，KMP利用Pattern
//字符重复的特性来排除不必要的比较，从而可以每次移动n位来排除冗余。对于
//Next函数近似接近O(m)，KMP算法的时间复杂度为O(n)，所以整个算法的
//时间复杂度为O(n+m)。
public class KMPSearch {
	private static int[] calculateNext(char[] s){
		int i=-1;
		int j=0;
		int length=s.length;
		int next[]=new int[length];
		next[0]=-1;
		while(j<length-1){
			if(i==-1||s[i]==s[j]){
				i++;
				j++;
				next[j]=i;
			}else{
				i=next[i];
			}
		}
		return next;
	}
	public static int kmp(String a,String b){
		char[] p=a.toCharArray();//主串
		char[] s=b.toCharArray();
		int i=0;
		int j=0;
		int[] next=calculateNext(p);
		while(i<p.length&&j<s.length){
			if(p[i]==s[j]){//字符相同比较下一位
				i++;
				j++;
			}else{
				j=next[j];
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
	    int i=kmp(p,s);
	    System.out.println("子串在主串中的位置："+i);
	}

}
