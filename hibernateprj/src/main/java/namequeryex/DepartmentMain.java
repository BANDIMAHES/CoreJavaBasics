package namequeryex;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class DepartmentMain {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        
    /*    Department d = new Department(10, "it", "Bombay");
        s.save(d);
        Department d1 = new Department(12, "sale", "Andhra Pradesh");
        s.save(d1);
        Department d2 = new Department(11, "hr", "Delhi");
        s.save(d2);
        t.commit();
        System.out.println("Recoed inserted");  */
      
       /* Query q1 = s.createQuery("select count(*) from Department");
        System.out.println("Count : "+q1.list().get(0)); */
        
      /*  Query q2= s.createQuery("select count(Id),dname from Department group by dname");
        System.out.println("Count : "+q2.list().get(0));
        List<Object[]> list = q2.list();
        for(Object[] arr: list)
        {
        	System.out.println(Arrays.toString(arr));
        }  */
        
		  
	    
	        /*Query q2 = s.createQuery("select count(s.id),s.dlocation from Department s group by s.dlocation");

	        List<Object[]> list = q2.list();

	        for(Object[] arr: list)

	        {

	        	System.out.println(Arrays.toString(arr));

	        }*/
	    
	    
	   /* Criteria criteria = s.createCriteria(Department.class);

	    criteria.addOrder(Order.asc("dlocation"));
	    Criteria criteria1 = s.createCriteria(Department.class);

	    criteria1.add(Restrictions.eq("dlocation", "Bombay"));

	   List <Department>dep = criteria1.list();
	    for(Department d :dep)
	    {
	     System.out.println(d);
	    }*/
	    
	    
	   /* Criteria criteria = s.createCriteria(Department.class);

	    criteria.addOrder(Order.asc("id"));
	    List <Department>dep = criteria.list();
	    for(Department d :dep)
	    {
	     System.out.println(d);
	    }*/
        
        
       
	}

}
