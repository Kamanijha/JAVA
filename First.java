class First{
    public  void car(){
        System.out.println("buy a car early 32");
    }
    public static void car2(){
        System.out.println("buy a car early 35");
    }

    public static void main(String[] args){
        byte x = 20;
        x =(byte) (x +  110);
        System.out.println(x);
        First c1 = new First();
        c1.car();
        car2();
        
    }
}