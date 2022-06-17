public class xPOWy_inLogyTime {

    public static void xPOW1y(int x, int y)
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

    public static void xPOW2y(int x, int y)
    {
            int res = 1;
            while(y > 0)
            {
                if(y%2 == 1)
                    res *= x;
                x = x * x;
                y = y / 2;
            }
        System.out.println(res);
    }

    public static void main(String[] args)
    {
        int x = 5;
        int y = 3;
        xPOW1y(x,y);
    xPOW2y(x,y);

    }

}
