class Solution {
    public int longestOnes(int[] nums, int k) {
       int l = 0 , maxi = 0, zero = 0;
       for(int r = 0; r < nums.length ; r++)
       {
        if(nums[r] == 0)
        {
            zero++;
        }
        while(zero > k)
        {
            if(nums[l] == 0)
            {
                zero--;
            }
            l++;
        }
        maxi = Math.max(r - l + 1, maxi);
       }
     return maxi;
    }
}