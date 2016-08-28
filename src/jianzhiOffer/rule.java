package jianzhiOffer;
//请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示
//任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。 在本题中，匹配
//是指字符串的所有字符匹配整个模式
//。例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，
//但是与"aa.a"和"ab*a"均不匹配 



//待完成！！！！！！
public class rule {
	 public static boolean match(char[] str, char[] pattern)  
	    {  
	              if(str==null||pattern==null) return false;  
	          
	        return matchCore(str,0,pattern,0);  
	    }  
	      
	    public static boolean matchCore(char[] str,int s, char[] pattern,int p) {  
	        if(str.length<=s&&pattern.length<=p)  
	            return true;//都匹配完了  
	        if(str.length>s&&pattern.length<=p)  
	            return false;//模式完了，字符串还有  
	        //模式串a*a没结束，匹配串可结束可不结束  
	          
	        if(p+1<pattern.length&&pattern[p+1]=='*'){//当前pattern的下一个是*号时  
	              
	            //字符串完了  
	            if(s>=str.length) return matchCore(str, s, pattern, p+2);  
	            else{  
	              
	            if(pattern[p]==str[s]||pattern[p]=='.'){  
	                //当前位置匹配完成，移动到下一个模式串  
	                return matchCore(str,s+1, pattern,p+2)  
	                        ||matchCore(str,s+1, pattern,p)  
	                        ||matchCore(str,s, pattern,p+2);  
	            }else  
	                return matchCore(str, s, pattern, p+2);  
	            }  
	        }  
	        //当前pattern的下一个不是*时候  
	        if(s>=str.length) return false;  
	        else{  
	        if(str[s]==pattern[p]||pattern[p]=='.')  
	            return matchCore(str, s+1, pattern, p+1);  
	        }  
	        return false;  
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


