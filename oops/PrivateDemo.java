package oops;

public class PrivateDemo {

	private int a;
	public PrivateDemo(int i) {
	}
	public static void main(String[] args) {
		 int a;
			/* Privatedemo(int i) {
			   a=i;
			   System.out.println(a);
			   }*/
			   public void Privatedemo(int a) {
				   this.a=a;
				
			}
			public void display() {
				System.out.println("display call");
				
			
			   
		  }
		public class PrivateAcessEx {
		          private int a;
			public static void main(String[] args) {
				Privatedemo d=new Privatedemo(10);
				d.display();
				System.out.println(d.a);
				//System.out.println("value of b:"+d.b);
				
				//PrivateAcessEx p=new PrivateAcessEx();
				d.a=10;
				
			
			}

		

	}

}
