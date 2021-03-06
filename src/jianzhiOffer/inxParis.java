package jianzhiOffer;
//在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序
//对。输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模
//的结果输出。 即输出P%1000000007 
public class inxParis {
	public static void main(String[] args) {
		 inxParis a=new  inxParis();
		 int b[]={1,2,3,4,5,6,7,0};
		 a.InverseParis(b);
	}
	public int InverseParis(int[] array){
		if(array==null||array.length==0) return 0;
		int pairsNum=mergeSort(array,0,array.length-1);
		return pairsNum;
	}
	public int mergeSort(int[] array,int left,int right){
		if(left==right) return 0;
		int mid=(left+right)/2;
		int leftNum=mergeSort(array,left,mid);
		int rightNum=mergeSort(array,mid+1,right);
		return (Sort(array,left,mid,right)+leftNum+rightNum)%1000000007;
	}
	public int Sort(int[] array,int left,int middle,int right){
		int cur1=middle;
		int cur2=right;
		int cur3=right-left;
		int temp[]=new int[right-left+1];
		int pairsNum=0;
		while(cur1>left&&cur2>=middle+1){
			if(array[cur1]>array[cur2]){
				temp[cur3--]=array[cur1--];
				pairsNum+=(cur2-middle);
				if(pairsNum>1000000007){
					pairsNum%=1000000007;
				}else{
					temp[cur3--]=array[cur2--];
				}
			}
			
		}
		while(cur1>=left){
			temp[cur3--]=array[cur1--];
		}
		while(cur2>=middle+1){
			temp[cur3--]=array[cur1--];
		}
		int i=0;
		while(left<=right){
			array[left++]=temp[i++];
		}
		return pairsNum;
		
	}
	

}
