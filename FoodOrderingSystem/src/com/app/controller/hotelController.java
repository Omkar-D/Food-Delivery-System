package com.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.pojos.Restaurant;
import com.app.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class hotelController {

	@Autowired
	private CustomerService service;
	
	
	
	public hotelController() {
		super();
	}



	@GetMapping("/menu")
    public String menuList(HttpServletRequest req,HttpSession hs){
		//String city=(String)hs.getAttribute("selectedcity");
		//String cityname = (String)req.getParameter("city");
		System.out.println("in Menu");
		//System.out.println(city);
		
		String location="Aundh";
		List<Restaurant> hotels=service.getHotelsByLocation(location);
		//hs.setAttribute("Hotels", hotels);
		System.out.println(hotels);
	return "/hotelList";
} 
	 
	 
}
