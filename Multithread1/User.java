

public class User extends Thread{
    String name;
    int duration;

    User(String name,int duration){
        this.name = name;
        this.duration = duration;
    }


    public void run(){
        try {
            watch();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
    public  void watch() throws InterruptedException{
        if (name.equalsIgnoreCase("raman")) {
            Thread.sleep(10000);
        }
        System.out.println("thread name is ; " + Thread.currentThread().getName());
        for(int i = 1;i<=duration;i++){
            System.out.println(name + " is watching for " + i + " min");
        }
    }
}
