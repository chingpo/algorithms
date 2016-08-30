package dynamicproxy;

public class RealStar implements Star{

	@Override
	public void confer() {
		System.out.println("RealStar.confer()");
		
	}

	@Override
	public void signContract() {
		System.out.println("RealStar.signContract()");
		
	}

	@Override
	public void sing() {
		System.out.println("RealStar(真实明星在唱歌).sing()");
		
	}

	@Override
	public void bookTicket() {
		System.out.println("RealStar.bookTicket()");
		
	}

	@Override
	public void collectMoney() {
		System.out.println("RealStar.collectMoney()");
		
	}

}
