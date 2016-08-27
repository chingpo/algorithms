package jianzhiOffer;


import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
//找出字符串中第一个只出现一次的字符
//
//详细描述：
//
//接口说明
//
//原型：
//
//bool FindChar(char* pInputString, char* pChar);
//
//输入参数：
//
//char* pInputString：字符串
//
//输出参数（指针指向的内存区域保证有效）：
//
//char* pChar：第一个只出现一次的字符
//
//如果无此字符 请输出'.'
public class firstOne {
	public static  char FirstNotRepeatingChar(String str) {
		if(str == null || str.length()==0) return '.';
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
            	int k=map.get(ch);
            	k++;//hashmap好棒
            	map.put(ch, k);
            }else{
            	map.put(ch, 1);
            }
        }
        for(int i=0;i<str.length();i++){
        	char ch=str.charAt(i);
        	if(map.get(ch)==1)
        		return ch;
        }
        return '.';
     
		    }
		    public static void main(String[] args) {
		    	Scanner in = new Scanner(System.in);
		        while (in.hasNext()) {//注意while处理多个case
		            String a = in.next();
		           
		            System.out.println(FirstNotRepeatingChar(a) );
		
		    	
			}
		    }
}
