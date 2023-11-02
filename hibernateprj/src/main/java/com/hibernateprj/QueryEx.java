package com.hibernateprj;

import java.util.List;

import com.mysql.cj.Session;

public class import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernateprj.Student;


/**
 * Hello world!
 *
 */
public class QueryEx 
{
    public static <EmployeeDetails> void main( String[] args )
    {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s = (com.mysql.cj.Session) sf.openSession();
        Transaction t = ((SharedSessionContract) s).beginTransaction();
//        EmployeeDetails ed = new EmployeeDetails();
//        ed.setEmployee_Name("Sneha1");
//        ed.setDesignation("Dev");
//        EmployeeDetails ed1 = new EmployeeDetails();
//        ed1.setEmployee_Name("rakshit1");
//        ed1.setDesignation("Test11");
//        s.save(ed);//insert record in table
//        s.persist(ed1);
//        t.commit();
//        System.out.println("Record Inserted");
//        
//        EmployeeDetails ed2 = new EmployeeDetails();
//        ed2.setId(3);
//        s.delete(ed2);
//        System.out.println("Record deleted Successfully "+ed2.getId());
//        t.commit();
        
//        EmployeeDetails ed2 = new EmployeeDetails();
//      ed2.setId(4);
//      ed2.setDesignation("Dev");
//      ed2.setEmployee_Name("Rakshith");
//      s.update(ed2);
//      System.out.println("Record updated Successfully "+ed2.getId());
//      t.commit();
        
      EmployeeDetails1 ed2 = new EmployeeDetails1();
      
      System.out.println(" Searched Record is :"+((Student) ed2).getId());
      
      t.commit();
        
        
        Query query = ((SharedSessionContract) s).createQuery("from EmployeeDetails");
        List<EmployeeDetails> arr = query.list();
        
        for(int i=0;i<arr.size();i++)
        {
        	System.out.println("Id :"+((Student) arr.get(i)).getId() +"\nName : "+((Object) arr.get(i)).getEmployee_Name() +"Designation :" +((Object) arr.get(i)).getDesignation());
        }
        sf.close();
        
        
    }


	}
	

