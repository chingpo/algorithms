import java.util.Scanner;

//小Q最近遇到了一个难题：把一个字符串的大
//写字母放到字符串的后面，各个字符的相对位置不变，且不能申请额外的空间。
//你能帮帮小Q吗？ 
public class Tencent2 {
	 public static String getResult(String str) {
		 StringBuffer sb1=new StringBuffer();
		 StringBuffer sb2=new StringBuffer();
		 char[] a=str.toCharArray();
		 for(int i=0;i<str.length();i++){
			 if(a[i]>=97&&a[i]<=122){
				 sb1.append(a[i]);
			 }else if(a[i]>=65&&a[i]<=90){
				 sb2.append(a[i]);
			 }
		 }
		 String result=sb1.append(sb2).toString();
		return result;
		      
	    }
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.nextLine();
       System.out.println(getResult(s)); 
       
        }
		
    }
}


