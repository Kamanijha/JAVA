

public class Processor {
    String brand;
    int core;

    Processor(){

    }
    Processor(String brand,int core){
        this.brand = brand;
        this.core= core;
    }

    public void showDetails(){
        System.out.println(brand);
        System.out.println(core);

    }
}
