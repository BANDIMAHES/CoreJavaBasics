package Basic;

public class LocalVariable {
	
		 String name = "Mahesh";
			public void DisplayAge()
			{
				//Local variable
				int age = 0;
				age = age+30;
				System.out.println("Student age is :"+age);
			}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalVariable ex=new LocalVariable();
		ex.DisplayAge();
		System.out.println("Name: "+ex.name);
	}

}
