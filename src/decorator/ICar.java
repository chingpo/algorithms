package decorator;

public interface ICar {
	void move();

}
class Car implements ICar{

	@Override
	public void move() {
		System.out.println("陆地上跑");
		
	}
	
}

class SuperCar implements ICar{
protected ICar car;
public SuperCar(ICar car) {
	super();
	this.car=car;
}
	@Override
	public void move() {
		car.move();
		
	}
	
}

class FlyCar extends SuperCar{

	public FlyCar(ICar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	
	public void fly(){
		System.out.println("天上飞");
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		fly();
	}
}


class WaterCar extends SuperCar{

	public WaterCar(ICar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	
	public void swim(){
		System.out.println("水中游");
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		swim();
	}
}