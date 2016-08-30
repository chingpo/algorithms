package simplefactory;


public class CarFactory {
	public static Car createCar(String type){
		if("audi".equals(type)){
			return new Audi();
		}else if("benz".equals(type)){
			return new Benz();
		}else{
			return null;
		}
	}

}
