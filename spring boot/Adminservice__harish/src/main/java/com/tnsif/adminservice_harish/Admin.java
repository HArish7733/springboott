package com.tnsif.adminservice_harish;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Admin
{
	@Id
	@Column(name="aid")
	private int aid;

	@Column(name="name")
	private String name;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="email")
	private String email;
	
	@Column(name="address")
	private String address;
	
	@Column(name="shopname")
	private String shopname;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(int aid, String name, String username, String password, String email, String address,
			String shopname) {
		super();
		this.aid = aid;
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.address = address;
		this.shopname = shopname;
	}

	@Override
	public String toString() {
		return "Admin [aid=" + aid + ", name=" + name + ", username=" + username + ", password=" + password + ", email="
				+ email + ", address=" + address + ", shopname=" + shopname + "]";
	}
	
	
}

