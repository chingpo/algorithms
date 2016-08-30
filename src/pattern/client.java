package pattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.util.concurrent.CountDownLatch;

public class client {
	public static void main(String[] args) throws Exception {
//		singleton2 s1=singleton2.getInstance();
//		singleton2 s2=singleton2.getInstance();
//        System.out.println(s1);
//        System.out.println(s2);
//       System.out.println(singleton4.INSTANCE==singleton4.INSTANCE); 
	//测试反射和反序列化
       //通过反射方式直接调用私有构造器
//       Class<singleton2> clazz=(Class<singleton2>)Class.forName("pattern.singleton2");
//	   Constructor<singleton2> c=clazz.getDeclaredConstructor(null);
//	   c.setAccessible(true);
//	   singleton2 s3=c.newInstance();
//		singleton2 s4=c.newInstance();
//	    System.out.println(s3);
//	    System.out.println(s4);
	    //通过反序列化方式构造多个对象
//	    FileOutputStream fos=new  FileOutputStream("e:/a.txt");
//	    ObjectOutputStream oos=new  ObjectOutputStream(fos);
//	    oos.writeObject(s1);
//	    oos.close();
//	    fos.close();
//	    ObjectInputStream ois=new ObjectInputStream(new FileInputStream("e:/a.txt"));
//		singleton2 s5=(singleton2)ois.readObject();
//		System.out.println(s5);
     long start=System.currentTimeMillis();
     int threadNum=10;
	final CountDownLatch countDownLatch=new CountDownLatch(threadNum);
       for(int i=0;i<10;i++){
    	 
       new Thread(new Runnable() {
		@Override
		public void run() {
			for(int i=0;i<1000000;i++){
				Object o=singleton.getInstance();
				//Object o2=singleton4.INSTANCE;
			}
			countDownLatch.countDown();
		}
	}).start();
	}
       countDownLatch.await();
       long end=System.currentTimeMillis();
       System.out.println("总耗时："+(end-start));
	
	}

}
