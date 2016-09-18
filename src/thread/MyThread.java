package thread;
/*
 *  Java 中的覆盖@Override注解 写与不写的一点点理解 
    一般来说，写与不写没什么区别，JVM可以自识别 
    写的情况下：即说明子类要覆盖基类的方法，基类必须存在方法 
                        （控制类型public,protected，返回值，参数列表类型）与子类方法完成一致的方法，否则会报错（找不到被Override的方法）。 
    在不写@Override注解的情况下，当基类存在与子类各种条件都符合的方法是即实现覆盖； 
    如果条件不符合时，则是当成新定义的方法使用。 
    所以如果想覆盖基类方法时，最好还是写上@Override注解，这样有利于编译器帮助检查错误 
 * 
 * 
 * */
public class MyThread extends Thread {
	@Override
	public void run(){
		try {
			for(int i=0;i<10;i++){
				int time=(int)(Math.random()*1000);
				Thread.sleep(time);
				System.out.println("run="+Thread.currentThread().getName());
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
