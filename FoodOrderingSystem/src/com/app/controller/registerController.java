package com.app.controller;
import javax.persistence.NoResultException;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Cities;
import com.app.pojos.Customer;
import com.app.pojos.Item;
import com.app.pojos.Restaurant;
import com.app.service.CustomerService;
import com.mysql.fabric.Response;
import java.util.List;

@Controller
@RequestMapping("/customer")
public class registerController {
	
	@Autowired

	private CustomerService service;
	public registerController() {
		System.out.println("in RegisterController ctor");
	}
	@GetMapping("/register")
    public String registerMe(HttpSession hs){
		System.out.println("in Registerme");
		 List<Cities> cities=service.getCities();
		  hs.setAttribute("city",cities );
	return "/register";
}

	@PostMapping("/register")
	public String Register(@RequestParam String fname,@RequestParam String lname,@RequestParam String email,@RequestParam String pass1,@RequestParam String pass2,@RequestParam long mob,@RequestParam int house_no,@RequestParam String street,@RequestParam String city,@RequestParam String sub,@RequestParam int pin,Model map)
	{
		 System.out.println("in CostomerDetails");
		 if(pass1.equals(pass2)){
			 
		 String status=service.register(fname,lname,email,pass1,mob,house_no, street,city,sub,pin);
		 map.addAttribute("STATUS",status);
		 System.out.println(status);
		 return "/welcome";
		 }
		 return "/register";
	}
	
}
