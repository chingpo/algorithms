//for循环最慢，约为clone方法的2倍，约为System.arraycopy的4~5倍；System.arraycopy最快
public class copyTest {
	 private static String [] src   
	    = {"Aaaaaaaaaa", "Vvvvvvv", "Bbbb", "Cccc", "Dddd", "Eddeee", "FFFFFFffffffff",  
	        "Aaaaaaaaaa", "Vvvvvvv", "Bbbb", "Cccc", "Dddd", "Eddeee", "FFFFFFffffffff",  
	        "Aaaaaaaaaa", "Vvvvvvv", "Bbbb", "Cccc", "Dddd", "Eddeee", "FFFFFFffffffff",  
	        "Aaaaaaaaaa", "Vvvvvvv", "Bbbb", "Cccc", "Dddd", "Eddeee", "FFFFFFffffffff",  
	        "Aaaaaaaaaa", "Vvvvvvv", "Bbbb", "Cccc", "Dddd", "Eddeee", "FFFFFFffffffff",  
	        "Aaaaaaaaaa", "Vvvvvvv", "Bbbb", "Cccc", "Dddd", "Eddeee", "FFFFFFffffffff",  
	        "Aaaaaaaaaa", "Vvvvvvv", "Bbbb", "Cccc", "Dddd", "Eddeee", "FFFFFFffffffff",  
	        "Aaaaaaaaaa", "Vvvvvvv", "Bbbb", "Cccc", "Dddd", "Eddeee", "FFFFFFffffffff",  
	        "Aaaaaaaaaa", "Vvvvvvv", "Bbbb", "Cccc", "Dddd", "Eddeee", "FFFFFFffffffff",  
	        "Aaaaaaaaaa", "Vvvvvvv", "Bbbb", "Cccc", "Dddd", "Eddeee", "FFFFFFffffffff"};  
	      
	    private static String [] dst;  
	  
	    /** 
	     * @param args 
	     */  
	    public static void main(String[] args)  
	    {  
	        // TODO Auto-generated method stub  
	        System.out.println(forCopy(5000000));  
	        System.out.println(cloneCopy(5000000));  
	        System.out.println(systemJNICopy(5000000));  
	    }  
	      
	    /** 
	     * 使用for来复制数组 
	     * @param time 循环执行的次数 
	     * @return 执行的总时间 
	     */  
	    public static long forCopy(int time)  
	    {  
	        long start = System.currentTimeMillis();  
	        while(time-- > 0)  
	        {  
	            int size = src.length;  
	            dst = new String [size];  
	            for (int i = 0; i < size; i++)  
	            {  
	                dst[i] = src[i];  
	            }  
	        }  
	        long end = System.currentTimeMillis();  
	        return (end - start);  
	    }  
	      
	    public static long cloneCopy(int time)  
	    {  
	        long start = System.currentTimeMillis();  
	        while(time-- > 0)  
	        {  
	            dst = (String[])src.clone();  
	        }  
	        long end = System.currentTimeMillis();  
	        return (end - start);  
	    }  
	      
	    public static long systemJNICopy(int time)  
	    {  
	        long start = System.currentTimeMillis();  
	        while(time-- > 0)  
	        {  
	            int size = src.length;  
	            System.arraycopy(src, 0, dst, 0, size);  
	        }  
	        long end = System.currentTimeMillis();  
	        return (end - start);  
	    }  

}
