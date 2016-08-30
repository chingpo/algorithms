package bridge;

public interface Computer {
	void sale();	
}
class Desktop implements Computer{

	@Override
	public void sale() {
		System.out.println("销售台式机");
		
	}
	
}
class Laptop implements Computer{

	@Override
	public void sale() {
		System.out.println("销售笔记本");
		
	}
	
}
class Pad implements Computer{

	@Override
	public void sale() {
		System.out.println("销售平板");
		
	}
	
}
class LenovoDesktop extends Desktop{
	@Override
	public void sale() {
		System.out.println("销售联想台式机");
		
	}
}
class LenovoLaptop extends Laptop{
	@Override
	public void sale() {
		System.out.println("销售联想笔记本");
		
	}
}

class LenovoPad extends Pad{
	@Override
	public void sale() {
		System.out.println("销售联想平板");
		
	}
}

class AppleDesktop extends Desktop{
	@Override
	public void sale() {
		System.out.println("销售苹果台式机");
		
	}
}
class AppleLaptop extends Laptop{
	@Override
	public void sale() {
		System.out.println("销售苹果笔记本");
		
	}
}

class ApplePad extends Pad{
	@Override
	public void sale() {
		System.out.println("销售苹果平板");
		
	}
}




