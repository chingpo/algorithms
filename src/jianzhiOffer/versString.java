package jianzhiOffer;

public class versString {
	public String ReverseSentence(String str) {
        if(str==null||str.length()==0||str.trim().length()==0) return str;         
        StringBuffer sb = new StringBuffer();
        String[] s = str.trim().split(" ");//获得对象的字段的值，然后转成string类型，并且去掉前后空白
        for(int i = s.length-1;i>=0;i--){
            sb.append(s[i]);
            if(i-1>=0)
                sb.append(" ");
        }
        return sb.toString();
    }
public static void main(String[] args) {
	versString a=new versString();
	String s="I am a student.";
	System.out.println(a.ReverseSentence(s));
}
}
