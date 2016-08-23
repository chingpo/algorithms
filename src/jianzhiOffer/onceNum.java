package jianzhiOffer;
/**
 * 数组中有两个出现一次的数字，其他数字都出现两次，找出这两个数字
 * @param array
 * @param num1
 * @param num2
 */
public class onceNum {
	 public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
		 int len=array.length;
		 int index=1;
		 int sum=0;
		 if(array.length < 2) return ;
		 for(int i=0;i<len;i++){
			 sum^=array[i];
		 }
		  while((sum & index) == 0) index <<= 1;
		  for(int i = 0; i < array.length; ++ i ){
	            if((index & array[i]) == 0) num2[0]^= array[i];
	            else num1[0]^= array[i];
	        }
	    }
	
	 public static void main(String[] args) {
		 onceNum a=new onceNum();
		 int[] b={1,1,2,2,3,3,4,5};
		 int[] num1={0};
		 int[] num2={0};
		 a.FindNumsAppearOnce(b, num1, num2);
		 System.out.println(num1[0]+""+num2[0]);
	}

}
