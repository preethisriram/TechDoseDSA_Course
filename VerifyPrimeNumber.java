import static java.lang.Math.sqrt;

public class VerifyPrimeNumber {

    public static boolean PrimeNumber(int num)
    {

        for(int i=2;i<=sqrt(num);i++)
        {
            if(num % i==0)
                return false;
        }

        return true;
    }




    public static void main(String[] args)
    {
        int num = 7;
        boolean res = PrimeNumber(num);
        System.out.println(res);

    }


}
