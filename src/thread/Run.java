package thread;

public class Run {
public static void main(String[] args) {
//	MyThread mythread=new MyThread();
//	mythread.start();
//	System.out.println("运行结束");//运行结束  MyThread 多线程时代码执行顺序与调用顺序无关
	try {
		MyThread thread=new MyThread();
		thread.setName("myThread");
		thread.start();
		for(int i=0;i<10;i++){
			int time=(int)(Math.random()*1000);
			Thread.sleep(time);
			System.out.println("main="+Thread.currentThread().getName());
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
}
}
