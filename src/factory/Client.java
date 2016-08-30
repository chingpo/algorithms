package factory;

public class Client {
public static void main(String[] args) {
	CarFactory factory=new LuxuryCarFactory();
	Engine e=factory.creatEngine();
	e.run();e.start();
}
}
