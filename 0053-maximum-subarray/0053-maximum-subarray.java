class Solution {
    public int maxSubArray(int[] nums) {
        int left = 0, curSum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++)
        {
                curSum += nums[i];

                curSum = Math.max(curSum,nums[i]);

                max = Math.max(curSum,max); 
        }
        return max;
    }
}