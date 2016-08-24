package jianzhiOffer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//set.add(a)都是套路，微笑脸
public class isLucky {
	public static boolean isContinuous(int [] numbers) {
		if(numbers.length == 0) return false;
        Set<Integer> set = new HashSet<>();
        int maxn = -1, minn = 14;
        for(int a: numbers)
        {
            if(!set.add(a) && a!=0) return false;
            if(a!=0) {
                maxn = Math.max(maxn, a);
                minn = Math.min(minn, a);
            }
        }
        if(maxn - minn <=4) return true;
        return false;      
    }
	public static void main(String[] args) {
		int[] a={1,0,0,1,0};
		System.out.println(isContinuous(a));
	}

}
