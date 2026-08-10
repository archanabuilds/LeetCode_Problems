class Solution {
    public int findLengthOfLCIS(int[] nums) {

int maxi = 1, count = 1 , n = nums.length;

      if(n == 1)
        return 1;

       for(int i = 1; i < n;i++)
       { 
        if(nums[i] > nums[i - 1])  count++;

        else  count = 1;

         maxi = Math.max(maxi,count);
       }
       return maxi;
}
}