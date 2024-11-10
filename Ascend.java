public class Ascend {
    public static void main(String args[]) {

        int lim = Integer.parseInt(args[0]);
        int a = (int) (Math.random() * lim);
        int b = (int) (Math.random() * lim);
        int c = (int) (Math.random() * lim);

        System.out.println(a+" "+b+" "+c);

        int min1 = Math.min(a,b);
        int min2 = Math.min(b,c);
        int min3 = Math.min(min1,min2);
        int max1 = Math.max(a,b);
        int max2 = Math.max(b,c);
        int max3 = Math.max(max1,max2);
        int medium = (a+b+c)-(min3+max3);

        System.out.println(min3+" "+medium+" "+max3);
    }
}