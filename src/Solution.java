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
    public static  int GetUglyNumber_Solution(int index) {
    if(index<=0) return 0;
    int[] result = new int[index];
    int count=0;
    int a=0,b=0,c=0,temp=0;
    result[0]=1;
    while(count<index-1){
    	temp=min(result[a]*2,min(result[b]*3,result[c]*5));
    	if(temp==result[a]*2) a++;
    	if(temp==result[b]*3) b++;
    	if(temp==result[c]*5) c++;
    	result[++count]=temp;
    }
    return result[index-1];

    }
    private static  int min(int a,int b){
    	return (a>b)?b:a;
    }
    public static void main(String[] args) {
    	System.out.println(GetUglyNumber_Solution(7));
    	
	}
}