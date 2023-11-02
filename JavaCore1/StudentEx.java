package JavaCore1;
public class StudentEx {
	int rno;
	String name;
	public int id;
	public int degree;
	
	
	public void display () {
		System.out.println("Student Rollno: "+rno);
		System.out.println("Student Name: "+name);
	}

	public static void main(String[] args) {
		StudentEx s=new StudentEx();
		s.rno=1;
		s.name="mahesh";
		s.display();
		StudentEx s1=new StudentEx();
		s1.rno=12;
		s1.name="mahi";
		s1.display();
		StudentEx s2=new StudentEx();
		s2.rno=123;
		s2.name="mahe";
		s2.display();
		
	}

}
