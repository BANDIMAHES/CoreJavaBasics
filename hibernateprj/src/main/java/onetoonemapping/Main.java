package onetoonemapping;
import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;

 

public class Main {

 

	public static void main(String[] args) {

		SessionFactory sf=new Configuration().configure().buildSessionFactory();

		Session s=sf.openSession();

		Transaction t=s.beginTransaction();

		Question q=new Question(1, "Sql");

		Answer a=new Answer(101, "querrylang");

		q.setAns(a);

		s.save(q);

		s.save(a);

		t.commit();

		System.out.println("record inserted.....");

		

		

	}

 

}


