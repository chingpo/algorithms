package decorator;

public class Client {
	public static void main(String[] args) {
		Car car=new Car();
		car.move();
		System.out.println("增加新功能");
		FlyCar flycar=new FlyCar(car);
		flycar.move();
	}

}
