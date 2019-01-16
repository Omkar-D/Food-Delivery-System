package com.app.service;
import java.util.List;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.CustomerDao;
import com.app.dao.CustomerDaoImpl;
import com.app.pojos.Cities;
import com.app.pojos.Customer;
import com.app.pojos.Item;
import com.app.pojos.Restaurant;
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao dao;
	public CustomerServiceImpl() {
		System.out.println("in CustomerService ctor");
	}
	
public void createadmin(){
	
	 dao.createadmin();
}
	@Override
	public String register(String fname,String lname,String email,String pass1,long mob, int house_no,String street,String city,String sub,int pin) {
	System.out.println("in register of Service");
		return dao.register(fname,lname,email,pass1,mob,house_no, street,city,sub,pin);
	}
	
public Customer validate(String username, String pass) {
		
		return dao.validate(username, pass);
	}
public List<Cities> getCities()
{
	return dao.getCities();

}

public List<Restaurant> getHotelsByLocation(String location)
{
	System.out.println("Service");
	return dao.getHotelsByLocation(location);
}






}
