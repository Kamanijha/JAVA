

public class accountBalance {
    public static void CheckBalance(int balance,int withdrawal) throws InsufficientBalanceException{
        if(withdrawal>balance){
            throw new InsufficientBalanceException("u have not suffient balance");
        }else{
            System.out.println("u can withdrow");
        }
    }
}
