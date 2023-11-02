package corejava8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.*;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

public class LocalDateTime {
private static final Month December =null;
	public static void main(String[] args) {
		LocalDate todayDate=LocalDate.now();
		System.out.println("Today date is :"+LocalDate.now());
		System.out.println();

		LocalDate firstDay_2023 = LocalDate.of(2023, Month.JANUARY, 1);
		System.out.println("Specific Date= "+firstDay_2023);
		System.out.println();
		
		LocalTime Asia=LocalTime.now();
		
//		LocalDateTime Asia=LocalDateTime.now();
		System.out.println("LocaldateTime is "+Asia);
		System.out.println();

		LocalTime todayTime=LocalTime.now();
		System.out.println("Today time is "+todayTime);
		System.out.println();

		LocalDate LastDay_2024=LocalDate.of(2024, Month.DECEMBER,30);
		System.out.println("Lastday of 2024 is "+LastDay_2024);
		System.out.println();
Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your birth date (yyyy-mm-dd format only) ");
        String st = sc.nextLine();
        
        LocalDate Dob;
        Dob = LocalDate.parse(st);    
        System.out.println("Age is :- "+calcAge(Dob));
    }
    static int calcAge(LocalDate Dob)
    {
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(Dob,currentDate).getYears();
        return age;
	}

}