package jianzhiOffer;
//将一个字符串转换成一个整数，要求不能使用字符串转
//换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0 
public class strtoInt {
	   public static int StrToInt(String str) {
		   if (str.equals("") || str.length() == 0)
	            return 0;
	        char[] a = str.toCharArray();
	        int tag = 0;
	        if (a[0] == '-')
	            tag = 1;
	        int sum = 0;
	        for (int i = tag; i < a.length; i++)
	        {
	            if (a[i] == '+')
	                continue;//下边不执行
	            if (a[i] < 48 || a[i] > 57)//非0-9输出0
	                return 0;
	            sum = sum * 10 + a[i] - 48;
	        }
	        return tag == 0 ? sum : sum * -1; 
	    }
	   public static void main(String[] args) {
		String a="-2147483647";
		String c="1a33";
		int b=StrToInt(a);
		int e=StrToInt(c);
		System.out.println(b);
		System.out.println(e);
	}

}
