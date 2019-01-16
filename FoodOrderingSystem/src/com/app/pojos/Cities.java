package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "locations")
public class Cities {

	private int location_id;
	private String sub_area;
	private int pincode;
	private List<Restaurant> hotel=new ArrayList<>();
	
	
	public Cities() {
		super();
	}

	public Cities(String sub_area, int pincode) {
		super();
		this.sub_area = sub_area;
		this.pincode = pincode;
	}

	
	public Cities(int location_id, String sub_area, int pincode) {
		super();
		this.location_id = location_id;
		this.sub_area = sub_area;
		this.pincode = pincode;
	}

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getlocation_id() {
		return location_id;
	}

	public void setlocation_id(int location_id) {
		this.location_id = location_id;
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
	@OneToMany(mappedBy="location",cascade=CascadeType.ALL,fetch=FetchType.EAGER) 
	public List<Restaurant> getHotel() {
		return hotel;
	}

	public void setHotel(List<Restaurant> hotel) {
		this.hotel = hotel;
	}

	@Override
	public String toString() {
		return "Cities [location_id=" + location_id + ", sub_area=" + sub_area + ", pincode=" + pincode + "]";
	}
	
	
}
