package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

	private int id;
	private String fname;
	private String lname;
	private String email;
	private String password;
	private long mob_No;
	private int house_No;
	private String street;
	private String city;
	private String sub_area;
	private int pincode;
	private String role;
	public Customer() {
		System.out.println("in Customer ctor");
	}



	
	public Customer(String fname, String lname, String email, String password, long mob_No, int house_No, String street,
			String city, String sub_area, int pincode, String role) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.mob_No = mob_No;
		this.house_No = house_No;
		this.street = street;
		this.city = city;
		this.sub_area = sub_area;
		this.pincode = pincode;
		this.role = role;
	}




	public Customer(int id, String fname, String lname, String email, String password, long mob_No, int house_No,
			String street, String city, String sub_area, int pincode, String role) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.mob_No = mob_No;
		this.house_No = house_No;
		this.street = street;
		this.city = city;
		this.sub_area = sub_area;
		this.pincode = pincode;
		this.role = role;
	}




	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
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


	public long getMob_No() {
		return mob_No;
	}


	public void setMob_No(long mob_No) {
		this.mob_No = mob_No;
	}


	public int getHouse_No() {
		return house_No;
	}


	public void setHouse_No(int house_No) {
		this.house_No = house_No;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getSub_area() {
		return sub_area;
	}


	public void setSub_area(String sub_area) {
		this.sub_area = sub_area;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getRole() {
		return role;
	}




	public void setRole(String role) {
		this.role = role;
	}




	@Override
	public String toString() {
		return "Customer [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", password="
				+ password + ", mob_No=" + mob_No + ", house_No=" + house_No + ", street=" + street + ", city=" + city
				+ ", sub_area=" + sub_area + ", pincode=" + pincode + "]";
	}


	
	
	
}
