class CarDriver{
    public static void main(String[] args){
        System.out.println("========program start===========");
        Car tata = new Car();
        tata.y = 20.98;
        test();
        //System.out.println("x is :" + maruti.x);
        
        System.out.println("car tata is :" + tata);
        System.out.println("x from main :" + tata.x);
        System.out.println("y from main :" + tata.y);
        System.out.println("=========program end============");

    }
    public static void test(){
      System.out.println("========test method start===========");
      Car maruti = new Car();
      System.out.println("car maruti is :" + maruti);
      System.out.println("x is :" + maruti.x);
      maruti.x = 100;
      System.out.println("now x is :" + maruti.x);
      System.out.println("=========test method end===========");
    }
}