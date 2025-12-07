

public class Str {
    public static void main(String[] args) {
        // String s1 = "abs";
        // String s2 = "abs";
        // s2 = "spe";
        // System.out.println(s1);
        // System.out.println(s2);

        // System.out.println(System.identityHashCode(s1));
        // System.out.println(System.identityHashCode(s2));

        String s1 = new String("abc");
        String s2 = new String("abcdef");
        s1= "asdfg";
         String s3= "asdfg"; 
         String s4= "asdfg";
         String s5= "asdfg";
         System.out.println(s3);
         System.out.println(s4);
         System.out.println(s5);
         System.out.println(System.identityHashCode(s3));
         System.out.println(System.identityHashCode(s4));
         System.out.println(System.identityHashCode(s5));
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(System.identityHashCode(s1));
         System.out.println(System.identityHashCode(s2));
      
    }
}
