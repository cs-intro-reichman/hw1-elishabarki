public class NumWords {
    public static void main(String args[]) {

        int n = Integer.parseInt(args[0]);

        int ones = n%10;
        n -= ones;
        int tens = n%100;
        n -= tens;
        int hundreds = n/100;

        System.out.println((hundreds/100)+" hundreds, "+(tens/10)+" tens, and "+ones+" ones.");
    }
}