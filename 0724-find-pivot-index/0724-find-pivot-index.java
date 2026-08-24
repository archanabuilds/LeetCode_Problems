class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n+1];
        int sum = 0;
        for(int i = 0; i < n ; i++)
        {
            sum += nums[i];
            prefix[i+1] = sum;
        }

        for(int i = 0; i < n ; i++)
        {
            int lsum = prefix[i];
            int rsum =prefix[n] - prefix[i+1];
            if(lsum == rsum) return i;
        }
       return -1;
    }
}