package jianzhiOffer;
//public void add(Byte b){ b=b++; } 这里涉及java的自动装包/自动拆包
//(AutoBoxing/UnBoxing) Byte的首字母为大写，是类，看似是引用传递，但是在add函数内实现++操作，
//会自动拆包成byte值传递类型，所以add函数还是不能实现自增功能。也就是说add函数只是个摆设，没有任何作用
//。 Byte类型值大小为-128~127之间。
//add(++a);这里++a会越界，a的值变为-128 add(b); 前面说了，add不起任何作用，b还是127
public class Tip2
{
    public void add(Byte b)
    {
        b = b++;
    }
    public void test()
    {
        Byte a = 127;
        Byte b = 127;
        add(++a);
        System.out.print(a + " ");
        add(b);
        System.out.print(b + "");
    }
    public static void main(String[] args) {
		Tip2 a=new Tip2();
    	a.test();
	}
}