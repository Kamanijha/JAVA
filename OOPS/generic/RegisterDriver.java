

public class RegisterDriver {
    public static void main(String[] args) {
        Register<Integer , String> r = new Register<Integer,String>(111, "raman");
        System.out.println(r);
        //r.pridetails();
       System.out.println( r.get()); // this line print like this Register@15db9742
       System.out.println( r.get().t  + "\n and " + r.get().u);
    }
}
