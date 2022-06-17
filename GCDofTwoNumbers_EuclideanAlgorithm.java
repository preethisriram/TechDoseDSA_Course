public class GCDofTwoNumbers_EuclideanAlgorithm {
    public static int gcd(int a, int b)
    {

        if(a==0)
            return b;
        return gcd(b % a, a);
     //return 0;

    }




    public static void main(String[] args)
    {
        int x = 15;
        int y = 10;
        int res = gcd(x,y);
        System.out.println(res);


    }

}
