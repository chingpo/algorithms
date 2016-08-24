package jianzhiOffer;
//请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示
//任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。 在本题中，匹配
//是指字符串的所有字符匹配整个模式
//。例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，
//但是与"aa.a"和"ab*a"均不匹配 



//待完成！！！！！！
public class rule {
	public static boolean match(char[] str, char[] pattern) {
		
		for (int  j = pattern.length - 1;j>=0; j--) {
			if (pattern[j] == '*') {
				pattern[j]=0;
				char temp = pattern[j--];
				boolean flag = true;
				while (flag) {
					if (pattern[j] == temp){
							pattern[j] = 0;
							j--;
					}
					else{
						j++;
						flag = false;
					}
						
				}
			}
			for (int i = str.length - 1; i > 0; i--) {
				if (pattern[j] == '.')
					pattern[j--] = 0;
				if (str[i] == pattern[j])
					pattern[j--] = 0;
			}
			for (int n = 0; n < pattern.length; n++) {
				if (pattern[n] != 0)
					return false;
			}
		}
		return true;
	}
	 public static void main(String[] args) {
		char[] str={'a','a','a'};
		char[] a={'a','.','a'};//true
		char[] b={'a','b','*','a','c','*','a'};//true
		char[] c={'a','a','.','a'};	//false
		char[] d={'a','b','*','a'};//false
		boolean ra=match(str,a);
		boolean rb=match(str,b);
		boolean rc=match(str,c);
		boolean rd=match(str,d);
		System.out.println(ra);
		System.out.println(rb);
		System.out.println(rc);
		System.out.println(rd);
		}
	}


