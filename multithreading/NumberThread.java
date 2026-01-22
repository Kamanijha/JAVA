

public class NumberThread extends Thread{
    
    public void run(){
        printNumber();
    }
    public static void printNumber(){
        for(int i = 1;i<=5;i++){
            System.out.println(i);
        }
    }
}
