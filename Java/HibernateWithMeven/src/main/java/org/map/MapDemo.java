package org.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Question q1 = new Question();
		q1.setQuestion_id(1212);
		q1.setQuestion("What is Java");

		Answer ans1 = new Answer();
		ans1.setAnswer_id(343);
		ans1.setAnswer("Java is a programming language");
		ans1.setQue(q1);

		Answer ans2 = new Answer();
		ans2.setAnswer_id(342);
		ans2.setAnswer("With the help of java we can create the softwares.");
		ans2.setQue(q1);

		Answer ans3 = new Answer();
		ans3.setAnswer_id(341);
		ans3.setAnswer("Java has different type of frameworks.");
		ans3.setQue(q1);

		List<Answer> list = new ArrayList<Answer>();
		list.add(ans1);
		list.add(ans2);
		list.add(ans3);
		q1.setAnswer(list);

		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
//		s.save(q1);
//		s.save(ans1);
//		s.save(ans2);
//		s.save(ans3);

		Question que = (Question) s.get(Question.class, 1212);
		System.out.println(q1.getQuestion());
		for (Answer a : q1.getAnswer()) {
			System.out.println(a.getAnswer());
		}

		tx.commit();
		s.close();
		factory.close();

	}

}
