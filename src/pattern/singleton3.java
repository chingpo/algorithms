package pattern;
/*
 * 静态内部类
 * 
 * 线程安全，调用效率高，实现了延时加载
 * */
public class singleton3 {
	private static class SingletonClassInstance{
		private static final singleton3 instance=new singleton3();//不初始化，用的时候再加载
	}
	
	private singleton3(){}
	public static singleton3 getInstance(){
		return SingletonClassInstance.instance;
	}
}
