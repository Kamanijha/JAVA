class CarDriver{


    public static void main(String[] args){
        System.out.println("=======program start========");

        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
         //c1.test();
         //c2.test();
        Car m = new Car();
       m.model = "abc123";
       
       System.out.println(m);
       System.out.println(m.model);
       //c1.test();
       //c2.test();
       //c3.test();
      

        System.out.println("=======program end========");
    }
}