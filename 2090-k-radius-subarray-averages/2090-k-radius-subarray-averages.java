class Solution {
    public int[] getAverages(int[] nums, int k) {

        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = -1;
        }

        int windowSize = 2 * k + 1;
        long sum = 0;

        for (int i = 0; i < n; i++) {

            sum += nums[i];

            if (i >= windowSize - 1) {

                int center = i - k;

                ans[center] = (int)(sum / windowSize);

                sum -= nums[i - windowSize + 1];
            }
        }

        return ans;
    }
}