import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;

public class CalculateNCR_ValueForGivenNandR {

    public static void ncr(int n, int r)
    {
        int[][] pt =new int[n+1][n+1];
        pt[0][0]=1;
        for(int i=1;i<=n;i++)
        {
            pt[i][0]=1;
            pt[i][i]=1;
            for(int j=1;j<i;j++)
            {
                //pt[i][0]=1;
                //pt[i][i]=1;
                pt[i][j]= pt[i-1][j] + pt[i-1][j-1];
            }
        }

        System.out.println(pt[n][r]);


    }




    public static void main(String[] args)
    {
        int n = 6;
        int r = 2;
        ncr(n,r);


    }

}
