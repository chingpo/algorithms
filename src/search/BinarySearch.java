package search;
//顺序存储结构
public class BinarySearch {
	public static void main(String[] args) {  
        int[] src = new int[] {1, 3, 5, 7, 8, 9};   
        System.out.println(binarySearch(src, 3));  
        System.out.println(binarySearch(src,0,src.length-1,9));  
    }  
  
    /** 
     * * 二分查找<a href="http://lib.csdn.net/base/31" class='replace_word' title="算法与数据结构知识库" target='_blank' style='color:#df3434; font-weight:bold;'>算法</a> * * 
     *  
     * @param srcArray 
     *            有序数组 * 
     * @param des 
     *            查找元素 * 
     * @return des的数组下标，没找到返回-1 
     */   
   public static int binarySearch(int[] srcArray, int des){   
      
        int low = 0;   
        int high = srcArray.length-1;   
        while(low <= high) {   
            int middle = (low + high)/2;   
            if(des == srcArray[middle]) {   
                return middle;   
            }else if(des <srcArray[middle]) {   
                high = middle - 1;   
            }else {   
                low = middle + 1;   
            }  
        }  
        return -1;  
   }  
        
      /**   
     *二分查找特定整数在整型数组中的位置(递归)   
     *@paramdataset   
     *@paramdata   
     *@parambeginIndex   
     *@paramendIndex   
     *@returnindex   
     */  
   /** 
    * 递归方法实现二分查找法. 
    * @param Array数组 
    * @param low 数组第一位置 
    * @param high 最高 
    * @param key 要查找的值. 
    * @return 返回值. 
    */  
   public static int binarySearch(int Array[],int low,int high,int key)  
   {  
       if (low<=high)  
       {  
           int mid = (low+high)/2;  
           if(key == Array[mid])  
               return mid;  
           else if(key<Array[mid])  
               //移动low和high  
               return binarySearch(Array,low,mid-1,key);  
           else if(key>Array[mid])  
               return binarySearch(Array,mid+1,high,key);  
       }  
	return -1;  
   }  
  
}  

