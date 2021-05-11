package com.jspiders.hibernate;

import java.util.Date;
import java.util.List;

import javax.persistence.Embedded;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jspiders.dto.Adress;
import com.jspiders.dto.Vehicle;
import com.jspiders.dto.userDetails128;

public class HibernateTest {

	public static void main(String[] args) {
		
		userDetails128 user= new userDetails128();
		user.setUserName("vishal");
		user.setJoinedDate(new Date());
		user.setUserId(1234);
		user.setSal(101);
		
		
		Vehicle vehi= new Vehicle();
		vehi.setVehicleName("TVS");
		vehi.setVeicleId(1765);
		Vehicle vehi1= new Vehicle();
		vehi1.setVehicleName("TVS");
		vehi1.setVeicleId(1769);
		
		user.getVehicleList().add(vehi);
		user.getVehicleList().add(vehi1);
		
		vehi.setUserDetails(user);
		vehi1.setUserDetails(user);
		
	//it will read the XML configuration file 
	SessionFactory sessionFactory=	new Configuration().configure().buildSessionFactory();
	Session session=sessionFactory.openSession();
	session.beginTransaction();

	//it will write the query  
	session.save(user);
	session.save(vehi);
	session.save(vehi1);
	session.getTransaction().commit();	
	session.close();
	
	session=sessionFactory.openSession();
	userDetails128 user1=(userDetails128)session.get(userDetails128.class,"vishal");
	
	session.close();
	System.out.println(user1);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}