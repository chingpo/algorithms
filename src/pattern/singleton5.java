package pattern;
/*
 * 双重检测锁
 * 
 * */
public class  singleton5 {
	private static singleton5 instance=null;
	public static singleton5 getInstance(){
		if(instance==null){
			singleton5 sc;
			synchronized(singleton5.class){
				sc=instance;
				if(sc==null){
					synchronized(singleton5.class){
					if(sc==null){
						sc=new singleton5();
					}
				}
				instance=sc;
			}
		}
	}
		return instance;
						
	}
	private singleton5(){}
}
