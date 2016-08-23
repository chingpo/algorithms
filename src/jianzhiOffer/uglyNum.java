package jianzhiOffer;
//包含因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因
//为它包含因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。 
public class uglyNum {
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
