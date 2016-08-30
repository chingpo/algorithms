package prototype;

import java.util.Date;

public class Sheep implements Cloneable{
	private String sname;
	private Date birthday;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj=super.clone();
		//深复制
//		Sheep s=(Sheep) obj;
//		s.birthday=(Date) this.birthday.clone();
		return obj;
	}
	public Sheep(String string, Date date) {
	
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	
	

}
