package JavaCore1;

public class ConstructionOverloading {
	ConstructionOverloading() {
		System.out.println("default");
		System.out.println("Introduction");
		
	}
	ConstructionOverloading(String name) {
		System.out.println("Name:" +name);
	}
	ConstructionOverloading(String scname,int rollNo) {
		System.out.println("School name:" +scname + ","+"Rollno:"+rollNo);
	}
	public static void main(String[] args) {
	ConstructionOverloading p1=new ConstructionOverloading();
	ConstructionOverloading p2=new ConstructionOverloading("Hanu");
	ConstructionOverloading p3=new ConstructionOverloading("Greenfinger",12);
		

	}

}
