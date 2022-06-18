public class catalan_numbers_binomial_coefficient_approach {



        public static void numTrees(long n) {

        long res;

        long c = combi(2*n , n);
        res = c / (n+1);
        System.out.println(res);

    }

        public static long combi(long n, long k)
        {
            long res = 1;
            if(k > (n-k))
                k = n-k;
            for(int i=0;i<k;i++)
            {
                res *= n-i;
                res /= i+1;
            }
            return res;
        }



    public static void main(String[] args)
    {
        int num = 5;
        numTrees(num);


    }
}
