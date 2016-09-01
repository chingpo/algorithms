package jianzhiOffer;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

/**
 * 数组中有两个出现一次的数字，其他数字都出现两次，找出这两个数字
 * @param array
 * @param num1
 * @param num2
 */
public class onceNum {
	public ArrayList<Integer> FindNumsAppearOnce(int [] array) {
//		 int len=array.length;
//		 int index=1;
//		 int sum=0;
//		 if(array.length < 2) return ;
//		 for(int i=0;i<len;i++){
//			 sum^=array[i];
//		 }
//		  while((sum & index) == 0) index <<= 1;
//		  for(int i = 0; i < array.length; ++ i ){
//	            if((index & array[i]) == 0) num2[0]^= array[i];
//	            else num1[0]^= array[i];
//	        }
		  if(array == null || array.length==0) return null;
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        for(int i=0;i<array.length;i++){
	            int ch = array[i];
	            if(!list.contains(ch)){
	                list.add(ch);
	            }else{
	                list.remove((Integer)ch);// list.remove(ch);会报越界错误因为把ch当成index而非要移除的元素
	            }
	        }
	       return list;
	       
	            
		
	    }
	
	 public static void main(String[] args) {
		 onceNum a=new onceNum();
		 int[] b={1,1,2,2,3,3,4,5};
		 int num1=0;
		 int num2=0;
		 ArrayList<Integer> list=a.FindNumsAppearOnce(b);
		  for(int i = 0;i<list.size();i++){
			   System.out.print(list.get(i));
			  }

	}

}
