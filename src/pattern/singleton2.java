package pattern;
/*
 * 饿汉式
 * 
 * 加载类时天然线程安全，不用加同步块，调用效率高，缺少延时加载的优势可能浪费资源。
 * */
public class singleton2 {
	private static singleton2 instance;//不初始化，用的时候再加载
	private singleton2(){
		if(instance!=null){
			throw new RuntimeException();
		}
	}
	public static synchronized singleton2 getInstance(){
		if(instance==null){
			instance=new singleton2();
		}
		return instance;
	}
	//反序列化
	private Object readResolve() {
		return instance;
		
	}
}
