package com.app.pojos;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="hotels")
public class Restaurant {
	private int hotel_id;
	private String hotel_name;
	private String hotel_type;
	private double hotel_opening_time;
	private double hotel_closing_time;
	private long phone_No;
	private Cities location;
	private List<Item> items=new ArrayList<>();
	
	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	public Restaurant(String hotel_name, String hotel_type, double hotel_opening_time, double hotel_closing_time,
			long phone_No, Cities location) {
		super();
		this.hotel_name = hotel_name;
		this.hotel_type = hotel_type;
		this.hotel_opening_time = hotel_opening_time;
		this.hotel_closing_time = hotel_closing_time;
		this.phone_No = phone_No;
		this.location = location;
	}




	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getHotel_id() {
		return hotel_id;
	}


	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}

	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="location_id")
	public Cities getlocation() {
		return location;
	}


	public void setlocation(Cities location_id) {
		this.location = location;
	}


	public String getHotel_name() {
		return hotel_name;
	}


	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}


	public String getHotel_type() {
		return hotel_type;
	}


	public void setHotel_type(String hotel_type) {
		this.hotel_type = hotel_type;
	}


	public double getHotel_opening_time() {
		return hotel_opening_time;
	}


	public void setHotel_opening_time(double hotel_opening_time) {
		this.hotel_opening_time = hotel_opening_time;
	}


	public double getHotel_closing_time() {
		return hotel_closing_time;
	}


	public void setHotel_closing_time(double hotel_closing_time) {
		this.hotel_closing_time = hotel_closing_time;
	}


	public long getPhone_No() {
		return phone_No;
	}


	public void setPhone_No(long phone_No) {
		this.phone_No = phone_No;
	}


	public void setItems(List<Item> items) {
		this.items = items;
	}


	@OneToMany(mappedBy="hotel_id",cascade=CascadeType.ALL,fetch=FetchType.EAGER) 
	public List<Item> getItems() {
		return items;
	}

	
	

	/*public void addItem(Item i)
	{
		items.add(i);//course ---> student
		i.setMyResto(this); //rev asso student --->course
	}
	public void removeItem(Item i)
	{
		items.remove(i);
		i.setMyResto(null);
	}*/
}
