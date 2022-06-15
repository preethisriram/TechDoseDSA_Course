import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;

public class PrimeFactorsOfN {

    public static void AllPrime(int num)
    {
        List<Integer> res = new ArrayList<Integer>(){};
        for(int i=2;i<=sqrt(num);i++)
        {
           while(num % i == 0 )
           {
               res.add(i);
               num = num / i;
           }

        }
        if(num>1)
            res.add((num));
        for(var item : res)
        {
            System.out.println(item);
        }

    }




    public static void main(String[] args)
    {
        int num = 15;
        AllPrime(num);


    }


}
