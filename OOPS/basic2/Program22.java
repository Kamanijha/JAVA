class Program22{

    public static void main(String[] args){
       System.out.println("========program start===========");
       Car c1 = test();
       System.out.println("obj ref from main is  : " + c1);
       System.out.println("========program end===========");

    }

    public static Car test(){
        System.out.println("========test method is start===========");
        Car c1 = new Car();
        System.out.println("car c1 is : " + c1);
        System.out.println("========test method is end===========");
      
      return c1;
    }
}