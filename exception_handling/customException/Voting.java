
public class Voting {
    
    public static void main(String[] args){
        checkAge(20);
    }

    public static void checkAge(int age) throws myException{
        if(age < 18){
            throw new myException("age is below 18");
            
        }
            System.out.println("u are  elegible");
        
    }
}
