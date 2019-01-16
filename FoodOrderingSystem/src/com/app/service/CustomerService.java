package com.app.service;

import java.util.List;

import com.app.pojos.Cities;
import com.app.pojos.Customer;
import com.app.pojos.Restaurant;

public interface CustomerService {
	
	public void createadmin();
	public String register(String fname,String lname,String email,String pass1,long mob, int house_no,String street,String city,String sub,int pin) ;
	public Customer validate(String username, String pass);
	public List<Cities> getCities();
	public List<Restaurant> getHotelsByLocation(String location);
}
