
public class Driver {
    public static void main(String[] args) {
        // Calculator add= (a,b)->System.out.println(a+b);
        // add.calculate(12,56);

        // Calculator substarct = (a,b)->System.out.println(a-b);
        // substarct.calculate(23,12 );
        
        Calculator add= (a,b)->(a+b);
        int res =  add.calculate2(12,56);
        System.out.println(res);
        Calculator substarct = (a,b)->{return a-b;};
        System.out.println(substarct.calculate2(23,12 ));

        Calculator pow = (a,b)->{
            int power = 1;
            for(int i = 1;i<=b;i++){
                power = power*a;
            }
            return power;
        };
        System.out.println(pow.calculate2(12, 2));
    }
}
