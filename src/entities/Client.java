package entities;

import java.util.Date;

public class Client {
	
	private String Name;
	private String Email;
	private Date bithDate;
	
	public Client() {
		
	}

	public Client(String name, String email, Date bithDate) {
		Name = name;
		Email = email;
		this.bithDate = bithDate;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Date getBithDate() {
		return bithDate;
	}

	public void setBithDate(Date bithDate) {
		this.bithDate = bithDate;
	}
	
	
	
	

}
