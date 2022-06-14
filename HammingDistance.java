public class HammingDistance {

    public static void hamming(int x, int y)
    {
        int count = 0;
       for(int i=0;i<32;i++) {

               if ((x>>i&1) != (y>>i & 1))
                   count++;

       }
        System.out.println(count);
    }


    public static void main(String[] args)
    {

        hamming(5,7);

    }




}
