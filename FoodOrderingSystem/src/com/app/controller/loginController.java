package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import javax.persistence.NoResultException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.pojos.Cities;
import com.app.pojos.Customer;
import com.app.pojos.Restaurant;
import com.app.service.CustomerService;
@Controller
@RequestMapping("/customer")
public class loginController {

	@Autowired

	private CustomerService service;
	public loginController() {
		
		System.out.println("in LoginController ctor");
	}
	
	@GetMapping("/login")
    public String loginMe(){
	//	service.createadmin();
		System.out.println("in Loginme");
		
	return "/login";
}
	@PostMapping("/login")
	public String login(@RequestParam String username,@RequestParam String pass,HttpSession hs,Model map)
	{
		
		 System.out.println("in login");
		Customer c=null;
		try{
		  c=service.validate(username, pass);
		  hs.setAttribute("cust_dtls", c);
		  if (c.getRole().equals("admin"))
		  {
			  return "redirect:/customer/list"; 
		  }
		  else
		  {
		  List<Cities> cities=service.getCities();
		  hs.setAttribute("city",cities );
		//  System.out.println(cities);
		  return "/welcomelogin";
		  }
		}catch(NoResultException e){
			map.addAttribute("status", "Invalid Login , pls retry");
			return "/login";
		}
	} 
		
		@GetMapping("/list")
		public String listAllCustomer(Model map) {
			List<Cities> cities=service.getCities();
			
			map.addAttribute("city", cities);
			return "/list";
		}

		@GetMapping("/logout")
		public String logMeOut(HttpSession hs, Model map, HttpServletRequest request, HttpServletResponse response) {
			System.out.println("in logout ....");
			map.addAttribute("cust_dtls", hs.getAttribute("cust_dtls"));
			hs.invalidate();
		//	response.setHeader("refresh", "3;url=" + request.getContextPath());
			return "/logout";
		}
 
		 
		
		 
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	
}
