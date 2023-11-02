package onetoonemappingbidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String [] args)

	{

		SessionFactory sf=new Configuration().configure().buildSessionFactory();

		Session s=sf.openSession();

		Transaction t=null;

		t=s.beginTransaction();

		Role r = new Role(2,"Test");

		//s.save(r);

		User u = new User(102,"Zayd",143, r);

		r.setUser(u);

		s.save(r);

		

		s.save(u);

		t.commit();

		System.out.println("Record Inserted");
	

}
}
