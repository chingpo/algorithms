package getofferPart2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//得到中位数，待完整
public class getMiddle {
 ArrayList<Integer> a=new ArrayList<>();
 public  void Insert(Integer num){
	 a.add(num);
	 Collections.sort(a);
 }
 public  Double GetMedian(){
	 int mid = a.size()/2;
     if((a.size()&1) == 0){
         Integer n1 = a.get(mid);
         Integer n2 = a.get(mid - 1);
         double s = (Double.valueOf(n1 + "") + Double.valueOf(n2 + ""))/2;
         return s;
     }else{
         double s = Double.valueOf(a.get(mid) + "");
         return s;
	 }
 }
 public static void main(String[] args) {
	 getMiddle r=new getMiddle();
		Scanner in = new Scanner(System.in);
        while (in.hasNext()) {//注意while处理多个case
            Integer b = in.nextInt();
            r.Insert(b);
            System.out.println(r.GetMedian());
        }
        
}
}



