package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name="items")
public class Item {
	private int menu_id;
	private String menu_name;
	private Double menu_price;
	private Restaurant hotel_id;
//test branch new
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getMenu_id() {
		return menu_id;
	}


	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}


	public String getMenu_name() {
		return menu_name;
	}


	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}


	public Double getMenu_price() {
		return menu_price;
	}


	public void setMenu_price(Double menu_price) {
		this.menu_price = menu_price;
	}


	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	public Restaurant getHotel_id() {
		return hotel_id;
	}


	public void setHotel_id(Restaurant hotel_id) {
		this.hotel_id = hotel_id;
	}


	@Override
	public String toString() {
		return "Item [menu_id=" + menu_id + ", menu_name=" + menu_name + ", menu_price=" + menu_price + ", hotel_id="
				+ hotel_id + "]";
	}


	

	
}
