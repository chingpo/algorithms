package adapter;
/*
 * 相当于usb和ps/2接口
 * 
 * */
public class Adapter extends Adaptee implements Target {
	@Override
	public void handlRequest() {
		super.request();
	}

}
