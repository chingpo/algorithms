package pattern;
/*
 * 懒汉式
 * 
 * 方法同步调用效率低
 * */
public class singleton {
	private static singleton instance=new singleton();//类初始化时立即加载这个对象
	private void singleton(){}
	public static singleton getInstance(){
		return instance;
	}

}
