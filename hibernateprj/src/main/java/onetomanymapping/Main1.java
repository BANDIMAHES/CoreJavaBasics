package onetomanymapping;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import onetoonemapping.Answer;
import onetoonemapping.Question;

public class Main1 {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();

		Session s=sf.openSession();

		Transaction t=null;

		t=s.beginTransaction();
		Question q=new Question(8, "What is your name? ");
		s.save(q);
		Answer a=new Answer(6, "bittu");
        Answer a1=new Answer(9, "Pujitha");
        Answer a2=new Answer(5, "Rama");
        s.save(a);
        s.save(a1);
        s.save(a2);
        List<Answer> l1= new ArrayList<Answer>();
        l1.add(a);
        l1.add(a1);
        l1.add(a2);
        q.setAns((Answer) l1);
        s.save(q);
         t.commit();
         System.out.println("Inserted");
         sf.close();
 	}

 }


