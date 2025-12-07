

public class Driver {
    public static void main(String[] args) {
        Calculator add = new Calculator() {
            public void calculate(int a,int b){
                System.out.println("a+b is " + (a+b));
            }
        };

        Calculator multiply = new Calculator() {
            public void calculate(int a, int b){
                System.out.println(a*b);
            }
        };

        add.calculate(12, 13);
        multiply.calculate(23, 34);
    }
}
