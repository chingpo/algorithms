package proxy;

public class Client {
	public static void main(String[] args) {
		Star real=new RealStar();
		Star proxy=new ProxyStar(real);
		proxy.confer();
		proxy.signContract();
		proxy.bookTicket();
		proxy.sing();//代理找到真实角色
		proxy.collectMoney();
	}

}
