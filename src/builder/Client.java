package builder;

public class Client {
	public static void main(String[] args) {
		AirShipDirector director=new YAirShipDirector(new YAirShipBuiler());
		AirShip ship=director.directAirShip();
		System.out.println(ship.getEngine().getName());
	}

}
