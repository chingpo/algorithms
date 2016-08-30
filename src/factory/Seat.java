package factory;

public interface Seat {
	void massage();

}
class LuxurySeat implements Seat{

	@Override
	public void massage() {
		System.out.println("自动");
		
	}
	
}

class LowSeat implements Seat{

	@Override
	public void massage() {
		System.out.println("不能自动");
		
	}
	
}