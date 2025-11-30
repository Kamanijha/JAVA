
public class Main {
    public static void main(String[] args) {
        
        Processor p = new Processor("mac",8);
        Ram r = new Ram(10,"window");
        Laptop l = new Laptop(); 
        l.pro = p;
        l.ram = r;
        l.pro.showDetails();
        l.ram.showRam();
    }
}
