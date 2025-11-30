class Driver{

    public static void main(String[] args){
       
        
        Engine e1 = new Engine(200,8,"petrol");
       Car c1 = new Car(e1);  // constructor injection
       c1.e.displayDetails();

       Engine e2 = new Engine(400,10,"disal");
       Car c2 = new Car(e2);  // constructor injection
       c2.e.displayDetails();

    }
    

    
}