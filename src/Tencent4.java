//在一组数的编码中，若任意两个相邻的代码只有一位二进制数不同， 则
//称这种编码为格雷码(Gray Code)，请编写一个函数，使用递归的方法生成N位的格雷码。
//
//给定一个整数n，请返回n位的格雷码，顺序为从0开始。

//这道题超出了认知范围，格雷码就没看明白，希望笔试的都是见过的，没见过的都能读懂逻辑！！
public class Tencent4 {
//	public static String[]  getResult(int n){
//		String a=Integer.toBinaryString(n);
//			StringBuffer sb=new StringBuffer();
//			a=sb.append('0').append(a).toString();
//		 
//		String[] str =new String[a.length()];
//		 	if(n < 1) str[0]="0"; 
//	        if(n == 1) {  
//	            str[0] = "0";  
//	            str[1] = "1";  
//	        }else{
//	        	 int[] bCode=new int[a.length()];	
//		for(int i = 0; i < a.length(); i++)
//		{
//	     bCode[i] = Integer.parseInt( String.valueOf(a.charAt(i)));
//		}
//		int[] grayCode=new int[a.length()];	
//	    praseToGrayCode(bCode, grayCode, 0 ,a.length()); 
//		 
//		 for(int i=0;i<grayCode.length;i++){
//		   str[i] = ""+grayCode[i];
//		 }
//	        }
//	    
//		return str;
//	}
//	public static void praseToGrayCode(int[] bCode, int[] grayCode, int i ,int len) {
//		if(i>=len-2)  
//	    {  
//	        grayCode[i] =  bCode[i] ^ bCode[i+1];  
//	        grayCode[i+1] = bCode[i+1];  
//	  
//	    }  
//	    else  
//	    {  
//	        grayCode[i] = bCode[i] ^ bCode[i+1];  
//	        praseToGrayCode(bCode,grayCode,i+1,len);  
//	    }  
//	 
//	}
//	public static void main(String[] args) {
//		String[] a=getResult(3);
//		for(int i=0;i<a.length;i++){
//			System.out.print(a[i]);
//		}
//		
//	}
	 public static void CreateGrayCode(String[] gray, int n) {  
	        if(n < 1)  
	            return;  
	        if(n == 1) {  
	            gray[0] = "0";  
	            gray[1] = "1";  
	        }else {  
	            CreateGrayCode(gray, n - 1);  
	            int length = 2 << (n - 1);  
	            for(int i = length - 1, j = 0; i >= 0; i --) {  
	                if(i < length /2)  
	                    gray[i] = "0" + gray[-- j];  
	                else  
	                    gray[i] = "1" + gray[j ++];  
	            }  
	        }  
	              
	    }  
	      
	    public static String[] CreateGrayCode(int n) {  
	        String gray[] = new String[2 << (n - 1)];  
	        CreateGrayCode(gray, n);  
	        return gray;  
	    }  
	    public static void main(String[] args) {  
	        // TODO Auto-generated method stub  
	        int n = 3;  
	        String gray[] = CreateGrayCode(n);  
	        for(int i = 0; i < 2 << (n - 1); i++) {  
	            System.out.println(gray[i]);  
	        }  
	    }  

}
