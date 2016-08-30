package adapter;
/*
 * 相当于usb和ps/2接口
 * 
 * */
public class Adapter2 implements Target {
	private Adaptee adaptee;
	
	@Override
	public void handlRequest() {
		adaptee.request();
	}
	public  Adapter2(Adaptee adaptee) {
		super();
		this.adaptee=adaptee;

	}

}
