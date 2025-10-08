package Strings;

public class Leapyear {
	public static void   main(String[]args) {
		int year = 2025;
		
		if (year % 400 == 0 || (year % 4== 0 && year % 100!= 0))
		{
			System.out.println("it is a leap year");
		}
		else
		{
			System.out.println("it is not aa  leap year");
			
		}
		

	
	
	}
}
