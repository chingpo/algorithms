package sort;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//public class Counter {
//	 public volatile static int count = 0;
//	 
//	    public static void inc() {
//	 
//	        
//	        try {
//	            Thread.sleep(1);
//	        } catch (InterruptedException e) {
//	        }
//	 
//	        count++;
//	    }
//	 
//	    public static void main(String[] args) {
//	 
//	   
//	 
//	        for (int i = 0; i < 1000; i++) {
//	            new Thread(new Runnable() {
//	                public void run() {
//	                    Counter.inc();
//	                }
//	            }).start();
//	        }
//	 
//	        System.out.println("运行结果:Counter.count=" + Counter.count);
//	    }
//}
//public class Counter {
//    public  int inc = 0;
//    
//    public synchronized void increase() {
//        inc++;
//    }
//    
//    public static void main(String[] args) {
//        final Counter test = new Counter();
//        for(int i=0;i<10;i++){
//            new Thread(){
//                public void run() {
//                    for(int j=0;j<1000;j++)
//                        test.increase();
//                };
//            }.start();
//        }
//        
//        while(Thread.activeCount()>1)  //保证前面的线程都执行完
//            Thread.yield();
//        System.out.println(test.inc);
//    }
//}
public class Counter {
    public  int inc = 0;
    Lock lock = new ReentrantLock();
    
    public  void increase() {
        lock.lock();
        try {
            inc++;
        } finally{
            lock.unlock();
        }
    }
    
    public static void main(String[] args) {
        final Counter test = new Counter();
        for(int i=0;i<10;i++){
            new Thread(){
                public void run() {
                    for(int j=0;j<1000;j++)
                        test.increase();
                };
            }.start();
        }
        
        while(Thread.activeCount()>1)  //保证前面的线程都执行完
            Thread.yield();
        System.out.println(test.inc);
    }
}