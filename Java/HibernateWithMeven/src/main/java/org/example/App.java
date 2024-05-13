package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) throws IOException {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

//		Student st = new Student();
//		st.setId(02);
//		st.setName("Shivam Lowqanshi");
//		st.setCity("Indore");
//
//		Teacher tc = new Teacher();
//		tc.setName("Ashish");
//		tc.setCity("Rewa");

		Address ad = new Address();
		ad.setStreet("04 nagar");
		ad.setCity("Indore");
		ad.setOpen(true);
		ad.setAddedDate(new Date());
		ad.setX(12342.543);

		// Image Reading
		FileInputStream file = new FileInputStream("src/main/java/AshishPatel.jpg");
		byte[] data = new byte[file.available()];
		file.read(data);
		ad.setImage(data);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
//		session.save(st);
//		session.save(tc);
		session.save(ad);
		tx.commit();
		session.close();

	}
}
