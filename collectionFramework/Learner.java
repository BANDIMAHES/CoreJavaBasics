package collectionFramework;
import java.util.*;

class Learner1{
	int lno;
	String lname,ldegree;
	public int getLno() {
		return lno;
	
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getLdegree() {
		return ldegree;
	}
	public void setLdegree(String ldegree) {
		this.ldegree = ldegree;
	}
	public void setLno(int lno) {
		this.lno = lno;
	}
	@Override
	public String toString() {
		return "Learner1 [lno=" + lno + ", lname=" + lname + ", ldegree=" + ldegree + "]";
	}
	public Learner1(int lno, String lname, String ldegree) {
		super();
		this.lno = lno;
		this.lname = lname;
		this.ldegree = ldegree;
	}
	
}

public class Learner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Learner1> l=new ArrayList<Learner1>();
Scanner s=new Scanner(System.in);
int choice;
do {
	System.out.println("1. Insert data ");
	System.out.println("2. Display data ");
	System.out.println("Enter your choice: ");
	choice=s.nextInt();
	switch(choice) {
	case 1:
		System.out.print("Enter lno ");
		int lno=s.nextInt();
		System.out.print("Enter lname ");
		String lname=s.next();
		System.out.print("Enter ldegree ");
		String ldegree=s.next();
		l.add(new Learner1(lno,lname,ldegree));
		break;
	
	case 2:
		Iterator<Learner1> i=l.iterator();
		while(i.hasNext()) {
			Learner1 le=i.next();
			System.out.println(le);
		}
	}
}while(choice!=0);

}
}
