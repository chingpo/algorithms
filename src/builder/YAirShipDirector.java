package builder;

public class YAirShipDirector implements AirShipDirector {

	private AirShipBuilder builder;

	public YAirShipDirector(AirShipBuilder builder) {
		this.builder = builder;
	}

	@Override
	public AirShip directAirShip() {
	   Engine e= builder.builderEngine();
	   OrbitalModule o=builder.builderrObitalModule();
	   Escape es=builder.builderEscapeTower();
	   
	   //组装
	   AirShip ship=new AirShip();
	   ship.setEngine(e);
	   ship.setEscapeTower(es);
	   ship.setOrbitalModule(o);
		return ship;
	}

}
