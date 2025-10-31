class Program11{
    public static void main(String[] args){
        System.out.println("============program start===========");
        Car c1 = new Car();
        Car c2 = new Car();
        
        System.out.println("obj ref from main : " + c1);  // here object is created and  so address is Car@7ad041f3 
        System.out.println("obj ref from main : " + c2); 
        System.out.println("obj ref from main : " + c1.x);
        test(c1,c2);  // pass object as a refernce in  method so 
        System.out.println("now x is :" + c1.x);
    }

    public static void test(Car c1 , Car c2){
        System.out.println("=============test method start============");
        System.out.println("obj ref from test is : " + c1);
        System.out.println("obj ref from test is : " + c2);  // here is same adders will be refer Car@7ad041f3
        c1.x = 200;   // so here assing new value in car class object so refect on both method if accessin test either main method beacuse both refer same adderss of object
        System.out.println("now x is :" + c1.x);
        System.out.println("test method is end=======");

    }
}