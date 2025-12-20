

public class Program {
    public static void main(String[] args) {
        int a = 12;int b = 0;
        System.out.println(a+b);
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            //System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
        System.out.println("program end");
        
    }
}
