public class SingleNumber {

    public static int singleNumber(int[] nums)
    {
        int mask = 0;
        for (var item:nums) {
            mask = mask ^ item;
          }
        return mask;
    }

    public static void main(String[] args)
    {
        int nums[] = new int[]{2,2,1,4,3,1,3,};
        int res = singleNumber(nums);
        System.out.println(res);
    }


}
