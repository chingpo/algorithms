package jianzhiOffer;

import java.util.Scanner;
import java.util.Stack;

public class replaceSpace {
	public static String rSpace(StringBuffer str){
		StringBuffer out=new StringBuffer();
		char[] s=str.toString().toCharArray();
		int slen=s.length;
        for (int i = 0; i < slen; i++) {
           
            if(s[i]==' '){
                out.append("%20");//连接一个字符串到末尾
            }else{
                out.append(s[i]);
            }
        }
        return out.toString();  //正则    str.toString().replaceAll("\\s", "%20");    
		
	}
	public static void main(String[] args){
		
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("We Are Happy");
		System.out.println(stringBuffer);
		System.out.println(rSpace(stringBuffer));
	    
	 
	}
	
}
