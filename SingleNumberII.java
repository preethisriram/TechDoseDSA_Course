public class SingleNumberII {
    public static int singleNumberII(int[] nums)
    {
        int shift = 1;
        int ans = 0;
      for(int i = 0;i<32;i++)
      {
          int count = 0;
          for(int j = 0;j<nums.length;j++)
          {
              if((shift & nums[j]) !=0)
                  count++;
          }
          if(count % 3 !=0)
              ans += shift;
          shift *=2;
      }
        return ans;
    }
    public static void main(String[] args)
    {
        int nums[] = new int[]{-5,-5,6,-5};
        int res = singleNumberII(nums);
        System.out.println(res);
    }

}
