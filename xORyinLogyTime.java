import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;

public class xORyinLogyTime {

    public static void xORy(int x, int y)
    {

        int res = 1;
        while(y > 0 )
        {
            if((y & 1) == 1)
                res = res * x;
            y >>= 1;
            x = x * x;

        }
        System.out.println(res);


    }




    public static void main(String[] args)
    {
        int x = 5;
        int y = 5;
        xORy(x,y);


    }

}
