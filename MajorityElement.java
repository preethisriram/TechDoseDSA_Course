public class MajorityElement {

    public static void majElement(int[] nums)
    {
        int ans = 0;
        int majority = 0;
        for(int i = 0;i<32;i++)
        {
            int count = 0;

            for(int j=0;j<nums.length;j++)
            {
             if((1<<i & nums[j])!=0)
                 count++;
            }
            if(count> (nums.length/2))
                ans += (1<<i);
        }
        for(int i = 0;i<nums.length;i++)
        {

            if(nums[i]==ans)
                majority++;

        }
        if(majority > (nums.length/2))
            System.out.println("The majority number is " +ans);
        else
            System.out.println("The majority number is not present");

    }

    public static void main(String[] args)
    {
        int[] nums = {2,3,4,7,7};
        majElement(nums);

    }
}
