class Program1{
    int z = 345;  // give error we can not access a non-ststic varailbe only accessbal on object reference
    static int y = 35;  // not give any error 
    public static void main(String[] args){
        System.out.println("==========program start===========");
        int x = 34;
        
         // static int y = 35;  here give error beacuse static varable one time and live entrie program run so inside main it is declear so after end of main method  the stack will be empty but this varable remains then give me error

         Program1 obj = new Program1(); // create object for accessing the z variable
         System.out.println(obj);
        test(obj.z);  
        System.out.println(y);

    }

    public static void test(int p){
        System.out.println("==========test method start===========");
        // Program1 obj = new Program1();
        // System.out.println(obj.z);
        System.out.println("p from test is: " + p);
        System.out.println("==========test method end===========");
    }
}