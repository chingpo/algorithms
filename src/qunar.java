
public class qunar {
	public static int getPos(int[] A, int n, int val) {
        // write code here
        int low=0,high=n-1;
    
        while(low<=high){
            int mid=low+(high-low)/2;
            if(val<A[mid]) high=mid-1;
            else if(val>A[mid]) low=mid+1;
                else {while((mid-1 >=0 ) && (A[mid-1] == A[mid])) {
                    mid=mid-1;
                }
                return mid;}
        }
       
        return -1;
    }
	public static void main(String[] args) {
		int[] a={4,4,10,21};
		System.out.println(getPos(a,4,4));
	}
}
//[1,3,3,4,5,7,9,5],8,5