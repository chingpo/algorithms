package jianzhiOffer;

import java.nio.charset.Charset;

public class circleNum {
	 public String LeftRotateString(String str,int n) {
		 if(str.length() == 0){
	            return str;
	        }
	        StringBuffer buffer = new StringBuffer(str);
	        StringBuffer buffer1 = new StringBuffer(str);
	        StringBuffer buffer2 = new StringBuffer();
	        buffer.delete(0,n);
	        buffer1.delete(n,str.length());
	        buffer2.append(buffer.toString()).append(buffer1.toString());
	        return buffer2.toString();
	        
	}
	 public static void main(String[] args) {
		String a="abcABC";
		circleNum b=new circleNum();
		System.out.println(b.LeftRotateString(a, 2));
	}

}
