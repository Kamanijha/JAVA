class CarEngineDriver{
   public static void main(String[] args){
    Car c1 = new Car();
    Car c2 = new Car();

    c1.name = "tata";
    System.out.println(c1.name);
    System.out.println(c2.name);
     System.out.println("engine details =========");
    c1.e.showDetails();
   }
}