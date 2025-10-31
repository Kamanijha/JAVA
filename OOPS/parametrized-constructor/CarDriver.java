class CarDriver{

    public static void main(String[] args){
        System.out.println("hello");

        Car c = new Car("tesla","black",2345667);
        Car c1 = new Car("tesla2","white",22774);
        Car c2 = new Car("tesla33","red",2343456);
        Car c3 = new Car("tesla44","yellow",2342353);
        System.out.println("name is : "+ c.name  + " price is: " + c.price);
        System.out.println("name is : "+ c1.name  + " price is: " + c1.price);
        System.out.println("name is : "+ c2.name  + " price is: " + c2.price);
        System.out.println("name is : "+ c3.name  + " price is: " + c3.price);


    }
}