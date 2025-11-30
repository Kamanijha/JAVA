package factoryMethodProject;

public class Driver {
    public static void main(String[] args) {
        Service service = new Service();
        Vehicle v1 = service.getVehicle();
        v1.StartRace();
    }
}
