package prototype;

public class Client2 {
	public static void testNew(int size){
		long start=System.currentTimeMillis();
		for(int i=0;i<size;i++){
			Laptop t=new Laptop();
		}
		long end=System.currentTimeMillis();
		System.out.println(end-start);
	}
	
	public static void testClone(int size) throws CloneNotSupportedException{
		Laptop t=new Laptop();
		long start=System.currentTimeMillis();
		
		for(int i=0;i<size;i++){
			Laptop temp=(Laptop) t.clone();
		}
		long end=System.currentTimeMillis();
		System.out.println(end-start);
	}	
	
public static void main(String[] args) throws CloneNotSupportedException {
	testNew(1000);
	testClone(1000);
}


}
class Laptop implements Cloneable{
	public Laptop(){
		try {
			Thread.sleep(10);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
@Override
protected Object clone() throws CloneNotSupportedException {
	Object obj=super.clone();
	return obj;
}
}