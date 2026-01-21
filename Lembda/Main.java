

public class Main {
    public static void main(String[] args) {
        // add of two number 
        Calculator add = (n1,n2)->n1+n2;
          // substartc 
        Calculator substract = (n1,n2)->{return n1-n2;};
        // calculate power
        Calculator power = (a,b)->{
            int pow = 1;
            for(int i = 1;i<=b;i++){
                pow = pow*a;
            }
            return pow;
        };

        int sum = add.calculate(12, 10);
        System.out.println(sum);
        System.out.println(substract.calculate(23, 12));
        System.out.println(power.calculate(12, 3));

        Vehicle bike=()->{
            System.out.println("satrt bike");
        };

        bike.start();
    }
}
