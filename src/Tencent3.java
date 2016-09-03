
import java.util.*;

//有n个数，两两组成二元组，差
//最小的有多少对呢？差最大呢？
//超时 
//我觉得编程题难度还能接受，就是没有IDE我就写不出来能通过的代码。再练习练习，冲关笔试！！！
public class Tencent3 {
	 public static void getResult(int n,ArrayList<Integer> arr) {
	     int k=0,minNum=1,maxNum=1,max=0,min=Integer.MAX_VALUE,m=0;
	     int[] array=new int[arr.size()^2];
	     for(int i=0;i<arr.size();i++){
	    	 for(int j=i+1;j<arr.size();j++){
	    		 k=Math.abs(arr.get(i)-arr.get(j));
	    		 if(k==min){
	    			 minNum+=1;
	    		 }else if(k==max){
	    			 maxNum+=1;
	    		 }
	    		 min=Math.min(min, k);
	    		 max=Math.max(max, k);
	    		 array[m++]=k;
	    	 }
	     }
	     Arrays.sort(array);
	     
		 System.out.println(minNum+" "+maxNum);
	
		      
	    }
	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<Integer>();
		  Scanner scanner = new Scanner(System.in);
		  while(scanner.hasNext()){
			    int  n = scanner.nextInt();
	        for (int i = 0; i < n; i++) {
	            int tempNum = 0;
	            tempNum = scanner.nextInt();
	            data.add(tempNum);
        }
	        getResult(n,data);
		  }
	     
	        
		
    }
}


