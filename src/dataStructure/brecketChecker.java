package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class brecketChecker {
	private String input;
	public brecketChecker(String in){
		this.input=in;
	}
	public void check(){
		int strLength=input.length();
		Stack stack=new Stack(strLength);
		for(int i=0;i<strLength;i++){
			char ch=input.charAt(i);//获取串中单个字符
			switch(ch){
			case '{':
			case '[':
			case '(':
				stack.push(ch);
				break;
			case '}' :  
            case ']' :  
            case ')' :  
            	if(!stack.isEmpty()){
            		char chx=stack.pop();
            		 if((ch== '{' && chx != '}')||  
                             (ch == '(' && chx != ')')||  
                             (ch == '[' && chx != ']')  
                          ){  
                                 System.out.println("匹配出错！字符："+ch+",下标："+i);  
                          }  
                   }else{  
                          System.out.println("匹配出错！字符："+ch+",下标："+i);  
                   }  
                    
            default :  
                   break;  
     }  
      
}  

if(!stack.isEmpty()){  
     //匹配结束时如果栈中还有元素，证明右分隔符缺失  
     System.out.println("有括号没有关闭！");  
}  
  	
            	
			
			}
	public static void main(String[] args) {  
        
        System.out.println("输入需要检测的字符串：");  
        String str = getString();  
        brecketChecker checker = new brecketChecker(str);  
        checker.check();  
 }  
  
 public static String getString(){  
        String str = "";  
        try{  
               InputStreamReader reader =new InputStreamReader(System.in);  
               BufferedReader bReader = new BufferedReader(reader);  
               str = bReader.readLine();  
        }catch(IOException e){  
               e.printStackTrace();  
        }  
        return str;  
 }  
		
	
}
