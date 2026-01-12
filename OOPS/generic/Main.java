

public class Main {
    public static void main(String[] args) {
        Test<Integer> iObj = new Test<Integer>(14);
        System.out.println(iObj.getObj());

        Test<String> sObj = new Test<String>("hello");
        System.out.println(sObj.getObj());

        Test<Double> dObj = new Test<Double>(23.56);
        System.out.println(dObj.getObj());
    }
}
