class Fruits{

    // public static int demo(int n){
    //     System.out.println("demo method");
    //     //System.out.println(n);
    //     return 2*n;
    // }

    public static void CheckEvenOrOdd(int n){
        if(n%2 == 0){
            System.out.println(n + " is even"  );
            return ;
        }
        System.out.println(n  + " is  odd "  );   
    }


    public static void main(String[] args){
        System.out.println("hello");
        First c1 = new First();
        c1.car();
        First c2 = new First();
        c2.car2();
         
         CheckEvenOrOdd(12.22);
        // System.out.println(demo(5));
        //  int x = demo(5);
        //  System.out.println(x);
    }
}