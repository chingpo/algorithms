import java.util.Scanner;

//给定一个字符串s，你可以从中删除一些字符，使得
//剩下的串是一个回文串。如何删除才能使得回文串最长呢？
//输出需要删除的字符个数。
//最长公共子序列
public class Tencent1 {
	 public static int getResult(String str) {
		 if(str.length()==0) return 0;
		 int len=str.length();
		 int[][] re=new int[len+1][len+1];
		 for(int i=0;i<len+1;i++){
			 re[0][i]=0;
			 re[i][0]=0;
		 }
		 String s = new StringBuffer(str).reverse().toString();
		 char[] res=s.toCharArray();
		 char[] p=str.toCharArray();
		 for(int i=1;i<len+1;i++){
			 for(int j=1;j<len+1;j++){
				 if(p[i-1]==res[j-1]){ 
					 re[i][j]=re[i-1][j-1]+1;
				 }else{
					 re[i][j]=Math.max(re[i][j-1], re[i-1][j]);
				 }
				 
			 }
		 }
		return len-re[len][len];	        
	    }
	 
	 //途牛笔试 最长公共子字符串
	 public static int getResult2(String str1,String str2){
		 if(str1==null||str2==null) return 0;
		 char[] p=str1.toCharArray();
		 char[] m=str2.toCharArray();
		 int len1=str1.length();
		 int len2=str2.length();
		 int a=Math.max(len1, len2)+1;
		 int[][] re=new int[a][a];
		 for(int i=0;i<len1+1;i++){
			 re[0][i]=0;
		 }
		 for(int i=0;i<len2+1;i++){
			 re[i][0]=0;
		 }
		 
		 for(int i=1;i<len1+1;i++){
			 for(int j=1;j<len2+1;j++){
				 if(p[i-1]==m[j-1]){
					 re[i][j]=re[i-1][j-1]+1;
				 }else re[i][j]=0;
			 }
		 }
		 int flag=0;
		 for(int i=1;i<len1+1;i++){
			 for(int j=1;j<len2+1;j++){
				 flag=Math.max(flag, re[i][j]);
			 }
			 
		 }
		return flag;
		 
	 }
	public static void main(String[] args) {
     //   Scanner in = new Scanner(System.in);

//        while (in.hasNext()) {
//            String s = in.nextLine();
//       System.out.println(getResult(s)); 
//       
//        }
        
    String a="bab",b="caba";
    System.out.println(getResult2(a,b));
        
    }
}


