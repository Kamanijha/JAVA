

import java.util.Scanner;

public class Driver {
    public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age:");
		int age=sc.nextInt();
		try {
			Registration.checkEligibility(age);
		}catch(InvalidAgeException e) {
			System.out.println("Exception Message: "+e.getMessage());
		}
		System.out.println("Program Ends");
		System.out.println("Program Ends");
	}
}


