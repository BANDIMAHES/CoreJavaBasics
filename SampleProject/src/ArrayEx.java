
public class ArrayEx {

	public static void main(String[] args) {
		int intArray[] = {0,1,2,3,4,5,6,7,8,9};
		
		int cloneArray[] = intArray.clone();
		System.out.println(intArray == cloneArray);
		
		for (int i = 0; i < cloneArray.length; i++) { 
			System.out.print(cloneArray[i]+" ");
		}
		// Multi dimension /shallow copy memory address same
		int b[][]= { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10}, {11,12,13,14,15}};
		int cloneb[][] = b.clone();
		
		System.out.println(b == cloneb);
		
		// shallow copy is created following print statement will print true
		System.out.println(b[0] == cloneb[0]);
		
		System.out.println(b[1] == cloneb[1]);
		
		for (int i = 0; i < b.length; i++) {
		    for (int j = 0; j < b.length; j++) {
		    	System.out.println("=>" + b[i][j]);
		    }
		    
		}
		for (int i = 0; i < cloneb.length; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("=>" + cloneb[i][j]+" ");
			}
			
		}
	}
}
		
		
