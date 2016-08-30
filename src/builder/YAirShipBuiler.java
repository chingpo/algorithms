package builder;

public class YAirShipBuiler implements AirShipBuilder{

	@Override
	public Engine builderEngine() {
        System.out.println("发动机");
		return new Engine("发动机");
	}

	@Override
	public OrbitalModule builderrObitalModule() {
		System.out.println("轨道");
		return new OrbitalModule("轨道");
	}

	@Override
	public Escape builderEscapeTower() {
		System.out.println("逃逸");
		return new Escape("逃逸塔");
	}
	

}
