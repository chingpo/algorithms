package factory;

public interface Tyre {
	void revolve();
}

class LuxuryTyre implements Tyre{

	@Override
	public void revolve() {
		System.out.println("nice");
		
	}
	
}
class LowTyre implements Tyre{

	@Override
	public void revolve() {
		System.out.println("norm");
		
	}
	
}