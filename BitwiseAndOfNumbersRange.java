public class BitwiseAndOfNumbersRange {


        public static int bitwiseAnd(int m, int n)
        {
            int shift = 0;

            while(m != n)
            {
                m >>= 1;
                n >>= 1;
                shift++;
            }

            return m << shift;
        }


        public static void main(String[] args)
        {
            int res = bitwiseAnd(5,7);
            System.out.println(res);
        }






}
