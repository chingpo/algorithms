package factory;

public interface Engine {
	void run();
	void start();

}

class LuxuryEngine implements Engine{

	@Override
	public void run() {
		System.out.println("块");
		
	}

	@Override
	public void start() {
		System.out.println("块");
		
	}
	
}

class LowEngine implements Engine{

	@Override
	public void run() {
		System.out.println("慢");
		
	}

	@Override
	public void start() {
		System.out.println("慢");
		
	}
	
}
