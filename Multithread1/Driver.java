

public class Driver {
    public static void main(String[] args) throws InterruptedException{
        User u1 = new User("mohan",20 );
        User u2 = new User("raman",10 );
        User u3 = new User("raj",5 );


        System.out.println(Thread.currentThread().getName());
        u1.start();
        u2.start();
        u3.start();
    }
}
