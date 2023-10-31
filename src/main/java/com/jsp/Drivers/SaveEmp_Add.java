package com.jsp.Drivers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.Entities.Address;
import com.jsp.Entities.CompositeForEmployee;
import com.jsp.Entities.Employee_Cp;

public class SaveEmp_Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		CompositeForEmployee cm = new CompositeForEmployee(101,"Rahul");
		Address ad = new Address();
		ad.setDoorNo("B-77");
		ad.setLoc("BEML nagar");
		ad.setPin(56135);
		Employee_Cp ecp = new Employee_Cp(22, "Raj",ad);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(ecp);
		et.commit();

	}

}
