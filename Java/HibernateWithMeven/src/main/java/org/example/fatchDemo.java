package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class fatchDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
         Student st =(Student)session.load(Student.class, 2);
		System.out.println(st);
				
		Address ad = session.get(Address.class, 1);
				System.out.println(ad.getStreet());
		
		session.close();
		factory.close();
	}
}
