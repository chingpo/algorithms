package builder;

public class AirShip {
	private OrbitalModule orbitalModule;
	private Engine engine;
	private Escape escapeTower;
	public OrbitalModule getOrbitalModule() {
		return orbitalModule;
	}
	public void setOrbitalModule(OrbitalModule orbitalModule) {
		this.orbitalModule = orbitalModule;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Escape getEscapeTower() {
		return escapeTower;
	}
	public void setEscapeTower(Escape escapeTower) {
		this.escapeTower = escapeTower;
	}
	
}	
class OrbitalModule{
	private String name;

	public OrbitalModule(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
class Engine{
	private String name;

	public Engine(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class Escape{
	private String name;

	public Escape(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

