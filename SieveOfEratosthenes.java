import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;

// This is an optimal approach to the problem, find all prime numbers till N
public class SieveOfEratosthenes {

    public static void Sieve(int num)
    {
        boolean[] sieve = new boolean[num+1];
        List<Integer> res = new ArrayList<Integer>(){};
        for(int i=2;i<=sqrt(num);i++)
        {
           if(sieve[i]==false)
           {

               for(int j=2;i*j<=num;j++)
               {
                   sieve[i*j] = true;
               }
           }
        }


        for(int i = 2;i< sieve.length;i++) {

                if(!sieve[i])
                    res.add(i);
        }
        for(var item:res)
            System.out.println(item);

    }




    public static void main(String[] args)
    {
        int num = 11;
        Sieve(num);


    }
}
