public class Catalan_numbers_with_dynamic_programming {

    public static void catalan(int n)
    {
       int[] c = new int[n+1];
       c[0]=1;
       c[1]=1;
       for(int i=2;i<=n;i++)
       {
           for(int j=0;j<i;j++)
           {
               c[i] += c[j] * c[i-j-1];
           }
       }
        System.out.println(c[n]);
    }




    public static void main(String[] args)
    {
        int num = 5;
        catalan(num);


    }
}
