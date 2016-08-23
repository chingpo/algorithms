package jianzhiOffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
//初始化块在构造器执行之前执行，类初始化阶段先执行最顶层父类的静态初始化块，依次向下执行，
//最后执行当前类的静态初始化块
//；创建对象时，先调用顶层父类的构造方法，依次向下执行，最后调用本类的构造方法。 
class B extends Object
{
    static
    {
        System.out.println("Load B");
    }
    public B()
    {
        System.out.println("Create B");
    }
}
class A extends B
{
    static
    {
        System.out.println("Load A");
    }
    public A()
    {
        System.out.println("Create A");
    }
}
 
public class Tip
{
    public static void main(String[] args)
    {
        new A();
    }
}