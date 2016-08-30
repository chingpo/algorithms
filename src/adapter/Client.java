package adapter;
/*
 * 客户端
 * 相当于只有USB接口
 * 
 * 
 * 
 * */
public class Client {
	public void test(Target t){
		t.handlRequest();
	}
	public static void main(String[] args) {
		Client c=new Client();
		Adaptee a=new Adaptee();
		//Target t=new Adapter();//类适配器，继承
		
		Target t=new Adapter2(a);	//对象适配器，组合的方式
		c.test(t);
		
	}

}
