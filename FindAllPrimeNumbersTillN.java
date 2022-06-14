import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;

public class FindAllPrimeNumbersTillN {

    public static void AllPrime(int num)
    {
        List<Integer> res = new ArrayList<Integer>(){};
        for(int i=2;i<=num;i++)
        {
            boolean isPrime = true;
            for(int j=2;j<=sqrt(i);j++)
            {
                if((i % j) == 0)
                {
                    isPrime = false;
                    break;

                }

            }
            if(isPrime)
                res.add(i);
        }

        for(var item : res)
        {
            System.out.println(item);
        }

    }




    public static void main(String[] args)
    {
        int num = 13;
        AllPrime(num);


    }

}
