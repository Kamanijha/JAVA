class Arithmatic{

    public static void main(String[] args){
        int n=5783;
        // System.out.println((n%10));
        // System.out.println((n/10)%10);
        // System.out.println((n/100)%10);
        // System.out.println((n/1000)%10);
        // System.out.println("left ot right");
        // System.out.println((n/1000)%10);
        // System.out.println((n/100)%10);
        System.out.println((n%10));// last one didgt
        System.out.println(((n/10)%10)*10 + (n%10)); // last 2 digit
        System.out.println(((n/100)%10)*100 + ((n/10)%10)*10 + (n%10)); // last 3 digit 
        int num = ((n/1000)%10)*1000 + ((n/100)%10)*100 + ((n/10)%10)*10 + (n%10) - (n%10);
        System.out.println(num / 10);
        int lastTwoDigit = ((n/1000)%10)*1000 + ((n/100)%10)*100 + ((n/10)%10)*10 + (n%10) - (n%10)
    }
}