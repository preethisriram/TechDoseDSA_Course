import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;

public class AllFactorsOfN {


    public static void Factors(int num)
    {

        List<Integer> list = new ArrayList<>() {};
        for(int i=2;i<=sqrt(num);i++)
        {
            if(num%i==0)
            {
                list.add(i);
                if (i != sqrt(num))
                    list.add(num / i);
            }

        }
        for(var item : list)
            System.out.println(item);
    }




    public static void main(String[] args)
    {
        int num = 36;
        Factors(num);


    }


}
