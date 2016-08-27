package getofferPart2;

import java.util.ArrayList;
import java.util.Collections;

//输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,
//则打印出由字符a,b,c所能排列出来的所有字符串ab
//c,acb,bac,bca,cab和cba。 结果请按字母顺序输出。
public class strList {
	 public ArrayList<String> Permutation(String str) {
		 ArrayList<String> list=new ArrayList<String>();
		 char[] ch=str.toCharArray();
		 Permu(ch,0,list);
		 Collections.sort(list);
		return list;
	    }
	 private void Permu(char[] ch, int i, ArrayList<String> list) {
		if(ch==null) return;
		if(i==ch.length-1){
			if(list.contains(String.valueOf(ch))) return;
	        list.add(String.valueOf(ch));	
		}else{
			for(int j=i;j<ch.length;j++){
				char temp=ch[j];
				ch[j]=ch[i];
				ch[i]=temp;
				Permu(ch,i+1,list);
				temp = ch[j];  
                ch[j] = ch[i];  
                ch[i] = temp; 
			}
		}
		
		//天哪，这道题做了好久。。。。晕
		
	}
	public static void main(String[] args) {
		strList a=new strList();
		String str="abcd";
		ArrayList<String> b=new ArrayList<String>();
		b=a.Permutation(str);
		System.out.println(b);
	}
}
