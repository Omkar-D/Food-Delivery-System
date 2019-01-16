package com.app.dao;
import java.sql.Date;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Cities;
import com.app.pojos.Customer;
import com.app.pojos.Item;
import com.app.pojos.Restaurant;
import java.util.List;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	
	public CustomerDaoImpl() {
	System.out.println("in CustomerDaoImpl ctor");
	}
	
	@Autowired
	private SessionFactory sf;
	
	public void createadmin()
	{
		System.out.println("in data");
		Cities c1=new Cities("Shivajinagar",411005);
		sf.getCurrentSession().save(c1);
		Cities c2=new Cities("Aundh",411007);
		sf.getCurrentSession().save(c2);
		Cities c3=new Cities("Pimpri",412303);
		sf.getCurrentSession().save(c3);
		Cities c4=new Cities("Akurdi",411035);
		sf.getCurrentSession().save(c4);
		Cities c5=new Cities("Baliwadi",410502);
		sf.getCurrentSession().save(c5);
		Cities c6=new Cities("Baner",411045);
		sf.getCurrentSession().save(c6);
		Cities c7=new Cities("Bavdhan",411021);
		sf.getCurrentSession().save(c7);
		Cities c8=new Cities("Bhosari",411026);
		sf.getCurrentSession().save(c8);
		Cities c9=new Cities("Bibvewadi",411037);
		sf.getCurrentSession().save(c9);
		Cities c10=new Cities("Chichwad",411019);
		sf.getCurrentSession().save(c10);
		Cities c11=new Cities("Hadafsar",411028);
		sf.getCurrentSession().save(c11);
		Cities c12=new Cities("Swargate",411042);
		sf.getCurrentSession().save(c12);
		
		Customer c=new Customer("namrata","madam","namrata@gmail","1234",1111111111,111,"null","Pune","null",123456,"admin");
		sf.getCurrentSession().save(c);
		Customer C=new Customer("Vishal","Jadhav","rama@gmail","1234",1111111111,111,"null","Pune","null",123456,"customer");
		sf.getCurrentSession().save(C);
		
		Restaurant r1=new Restaurant("Ashapuri","Pure Vegitarian",9.00,23.00,888888888,c2);
		sf.getCurrentSession().save(r1);
		Restaurant r2=new Restaurant("Giridhar","Pure Vegitarian",7.00,22.00,888888888,c2);
		sf.getCurrentSession().save(r2);
	
	}
	@Override
	public String register(String fname,String lname,String email,String pass1,long mob, int house_no,String street,String city,String sub,int pin)
	{
		int length = String.valueOf(mob).length();
		if(length>10 || length<10)
		{
			return "Invalid Mobile Number";
		}
		else if(!city.equalsIgnoreCase("pune"))
		{
			return "City must be Pune";
		}
		else if(!email.contains("@") || email.length()>30 || email.length()<10)
		{
			return "Invalid Email";
		}
		else
		{
		Customer c=new Customer(fname,lname,email,pass1,mob,house_no, street,city,sub,pin,"Customer");
		System.out.println("in register of dao");
		Integer id=(Integer)sf.getCurrentSession().save(c);
		return "Registration Successfully"+id;
		}
	}
	
	public Customer validate(String username, String pass) {
		
		
		String jpql="select c from Customer c where c.email=:u and c.password=:p";
		Customer c=sf.getCurrentSession().createQuery(jpql,Customer.class).setParameter("u", username).setParameter("p",pass).getSingleResult();
		return  c;
	}
	
	public List<Cities> getCities()
	{
		String jpql="select c From Cities c";
		return sf.getCurrentSession().createQuery(jpql,Cities.class).getResultList();	
	}
	
	public List<Restaurant> getHotelsByLocation(String location)
	{
		System.out.println("Dao");
		String id="select c from Cities c where c.sub_area=:c";
		Cities c=sf.getCurrentSession().createQuery(id,Cities.class).setParameter("c","Aundh").getSingleResult();
		System.out.println(c);
		int locationId=c.getlocation_id();
		System.out.println(locationId);
		String jpql="select r from Restaurant r where r.location.location_id=:loc";
		List<Restaurant> hotels= sf.getCurrentSession().createQuery(jpql,Restaurant.class).setParameter("loc",locationId).getResultList();
		
		System.out.println(hotels);
		
		return hotels;
	}
	
	
}


