
public class StringExa {

	public static void main(String[] args) {
String str = "Welcome to edubridge    ";
        
        //convert string into character array
        char[] arr = str.toCharArray();   
        String tempStr = "";
        for(char c:arr){
            
            if(c != ' '){
            	String str1 = "Welcome to edubridge    ";
                
                //convert string into character array
                char[] arr1 = str1.toCharArray();   
                String tempStr1 = "";
                for(char c1:arr1){
                    
                    if(c1 != ' '){
                        tempStr1 += c1;
                    }
                   // System.out.println(c);
                    System.out.println("Temp"+tempStr1);
                }
                 str1 = tempStr1;
                System.out.println(str1);       tempStr1 += c;
            }
           // System.out.println(c);
            System.out.println("Temp"+tempStr);
        }
         str = tempStr;
        System.out.println(str);

	}

}
