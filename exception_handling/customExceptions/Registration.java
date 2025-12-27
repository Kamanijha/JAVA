

public class Registration {
    public  static void  checkEligibility(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("you are underAge");
		}else {
			System.out.println("You are eligible for registration");
		}
	}
}
