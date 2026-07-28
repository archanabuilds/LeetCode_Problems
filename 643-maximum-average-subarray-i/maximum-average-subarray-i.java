class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        double sum = 0;
        double maxavg = Integer.MIN_VALUE;
        for(int right = 0; right < nums.length;right++)
        {
            sum += nums[right];
            if(right >=  k-1)
            {
                maxavg = Math.max(sum/k,maxavg);

                sum -= nums[left];
                left++;
            }
        }   
            return maxavg;
        
        
    }
}