

public class Vehicle extends Thread{
    String name;
    int distance;

    Vehicle(String name,int distance){
        this.name =  name;
        this.distance = distance;
    }

    public void run(){
        move();
    }

    public  void move(){
        for(int i = 1;i<=distance;i++){
            System.out.println(name + " is thraveled " + i+ " km");
        }
    }
}
