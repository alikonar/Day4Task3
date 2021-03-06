package Entities;

import Abstract.Entity;

public class User implements Entity {

	private int id;
	private int customerId;
	private String email;
	private String password;

	public User() {
	}

	public User(int id, String email, String password,int customerId) {
		this.id = id;
		this.email = email;
		this.password = password;
		this.customerId=customerId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId=customerId;
	}

}
