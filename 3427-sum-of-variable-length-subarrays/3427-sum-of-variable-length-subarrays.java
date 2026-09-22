class Solution {
    public int subarraySum(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        int i = 0;
        while (i < n) {
            int start = Math.max(0, i - nums[i]);
            int sum = 0;
            for (int k = start; k <= i; k++) {
                sum += nums[k];
            }
            pre[i] = sum;
            i++;
        }
        int psum = 0;
        for (int j = 0; j < n; j++) {
            psum += pre[j];
        }
        return psum;
    }
}