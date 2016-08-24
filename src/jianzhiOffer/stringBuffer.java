package jianzhiOffer;
//请实现一个函数用来找出字符流中第一个只
//出现一次的字符。例如，当从字符流中只读出前两个字
//符"go"时，第一个只出现一次的字符是"g"。当从该字符流中读
//出前六个字符“google"时，第一个只出现一次的字符是"l"。
//输出描述:
//
//如果当前字符流没有存在出现一次的字符，返回#字符。
public class stringBuffer {
    //Insert one char from stringstream
	int[] hashtable=new int[256];
	StringBuffer s=new StringBuffer();
    public void Insert(char ch)
    {
        s.append(ch);
        if(hashtable[ch]==0)
        	hashtable[ch]=1;
        else hashtable[ch]+=1;
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
    	char[] str=s.toString().toCharArray();
    	for(char c:str){
    		if(hashtable[c]==1)
    			return c;
    	}
    	return '#';
    
    }

}
