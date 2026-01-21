

public class Driver {
    public static void main(String[] args) {
        // this will create class without name
        Vehicle bike = new Vehicle(){
            public void start(){
                System.out.println("start bike");
            }

            public void stop(){
                System.out.println("stop bike");
            }
        };
    }
}
