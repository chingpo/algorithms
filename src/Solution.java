import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class Solution {
    public static  int FirstNotRepeatingChar(String str) {
   if(str==null||str.length()==0) return -1;
   ArrayList<Character> list=new ArrayList<Character>();
   for(int i=0;i<str.length();i++){
	   char ch=str.charAt(i);
	   if(!list.contains(ch)){
		   list.add(Character.valueOf(ch));
	   }else{
		   list.remove(Character.valueOf(ch));
	   }
   }
   if(list.size()<=0) return -1;
   return str.indexOf(list.get(0));
    }
    public static void main(String[] args) {
    	System.out.println(FirstNotRepeatingChar("google"));
    	
	}
}