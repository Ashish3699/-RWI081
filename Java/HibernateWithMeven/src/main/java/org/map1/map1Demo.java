package org.map1;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class map1Demo {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		emp1.setEid(01);
		emp1.setName("Ashish");
		emp2.setEid(02);
		emp2.setName("Shivam");

		Project project1 = new Project();
		Project project2 = new Project();
		project1.setPid(11);
		project1.setProjectName("Librery_Managment");
		project2.setPid(12);
		project1.setProjectName("ERP_Portal");
		
		
		List<Employee> employeelist = new ArrayList<Employee>();
		List<Project> projectlist = new ArrayList<Project>();
		
		employeelist.add(emp1);
		employeelist.add(emp2);
		
		projectlist.add(project1);
		projectlist.add(project2);
		
		emp1.setProject(projectlist);
		project1.setEmployee(employeelist);
		
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		
		s.save(project1);
		s.save(project2);
		s.save(emp1);
		s.save(emp2);
		
		
		tx.commit();
		s.close();
		factory.close();
	}

}
