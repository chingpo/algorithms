package prototype;

import java.util.Date;

public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		Date date=new Date(12312321331L);
		Sheep s1=new Sheep("amy",date);
	    System.out.println(s1); System.out.println(s1.getSname());
	    Sheep s2=(Sheep)s1.clone();
	    System.out.println(s2);
	   
	    System.out.println(s2.getSname());
	    s2.setSname("sher");
	    System.out.println(s2.getSname());
	}

}
