package com.hibernateprj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        Student s1 = new Student();
        s1.setName("B");
        Student s2 = new Student();
        s2.setName("A");
        s.save(s1);
        s.persist(s2);
        t.commit();
        System.out.println("Record Inserted");
        sf.close();
        
        
    }
}