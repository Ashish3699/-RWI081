package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class emDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Student st = new Student();
		st.setId(123);
		st.setCity("Jabalpur");
		st.setName("Ravendra");

		Certificate cf = new Certificate();
		cf.setCourse("Java");
		cf.setDuration("Dec2024");
		st.setCf(cf);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(st);
		tx.commit();	
				
		session.close();
		factory.close();
	}

}
