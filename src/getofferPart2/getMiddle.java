package getofferPart2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//得到中位数，待完整

public class getMiddle{
 public  Double GetMedian(ArrayList<Integer> a){
	 Collections.sort(a);
	 int mid = a.size()/2;
     if((a.size()&1) == 0){//偶数
         Integer n1 = a.get(mid);
         Integer n2 = a.get(mid - 1);
         double s = (n1  + n2 )/2.0;
         return s;
     }else{
         double s = a.get(mid);
         return s;
	 }
 }
 public static void main(String[] args) {
	 getMiddle r=new getMiddle();
	 ArrayList<Integer> a=new ArrayList<Integer>();
	 a.add(1);
	 a.add(2);
	 a.add(3);
	 a.add(4);
//	 a.add(5);
//        while (in.hasNext()) {//注意while处理多个case
//            Integer b = in.nextInt();
//            r.Insert(b);
            System.out.println(r.GetMedian(a));
           
        
        
}
}



