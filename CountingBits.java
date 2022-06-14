public class CountingBits {



    public static void countBits(int num)
    {
        int[] res = new int[num+1];
        for(int i=0;i<res.length;i++)
        {
            int count = 0;
            for(int j=0;j<32;j++)
            {
                if((i & 1<<j)!=0)
                    count++;
            }
            res[i] = count;
        }
        for(var item : res)
        {
            System.out.println(item);
        }
    }

    public static void main(String[] args)
    {
        int num = 10;
        countBits(num);

    }

}
