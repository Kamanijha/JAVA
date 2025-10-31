class CarDriver{

    public static void main(String[] args){
      System.out.println("========progarm start========");
      Car c1 = new Car();
      System.out.println("c1 is : " + c1);
      test();
      System.out.println("========progarm end========");
      System.out.println("x from main is :" + c1.x);

    }

    public static void test(){
      System.out.println("========test method is start========");
      Car c1 = new Car();
      System.out.println("c1 is : " + c1);
      System.out.println("x is :" + c1.x);
      c1.x = 100;
      System.out.println("now x is :" + c1.x);
      System.out.println("========test method is end========");
    }
}