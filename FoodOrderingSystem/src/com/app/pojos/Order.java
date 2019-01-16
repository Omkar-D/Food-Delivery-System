package com.app.pojos;
import java.sql.Date;

import javax.persistence.*;
@Entity
@Table(name="orders")
public class Order {
private int order_id;
private double total_price;
private int qty;
private int cust_id;
private int hotel_id;
private Date ordertime;
public Order() {
	super();
	// TODO Auto-generated constructor stub
}

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public int getOrder_id() {
	return order_id;
}
public void setOrder_id(int order_id) {
	this.order_id = order_id;
}
public double getTotal_price() {
	return total_price;
}
public void setTotal_price(double total_price) {
	this.total_price = total_price;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public int getCust_id() {
	return cust_id;
}
public void setCust_id(int cust_id) {
	this.cust_id = cust_id;
}
public int getHotel_id() {
	return hotel_id;
}
public void setHotel_id(int hotel_id) {
	this.hotel_id = hotel_id;
}
public Date getOrdertime() {
	return ordertime;
}

public void setOrdertime(Date ordertime) {
	this.ordertime = ordertime;
}
@Override
public String toString() {
	return "Order [order_id=" + order_id + ", total_price=" + total_price + ", qty=" + qty + ", cust_id=" + cust_id
			+ ", hotel_id=" + hotel_id + ", ordertime=" + ordertime + "]";
}

}
