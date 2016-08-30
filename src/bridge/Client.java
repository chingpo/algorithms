package bridge;

public class Client {
	public static void main(String[] args) {
		Computer2 c=new Laptop2(new Lenovo());
	   c.sale();
	}

}
