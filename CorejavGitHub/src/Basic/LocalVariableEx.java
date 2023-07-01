package Basic;
public class LocalVariableEx{
 String name = "Help";
	public void DisplayAge()
	{
		//Local variable
		int age = 0;
		age = age+30;
		System.out.println("Student age is :"+age);
	}
	public static void main(String args[]) {
		//Local Variable
		LocalVariableEx ex=new LocalVariableEx();
		ex.DisplayAge();
		System.out.println("Name: "+ex.name);
	}
}