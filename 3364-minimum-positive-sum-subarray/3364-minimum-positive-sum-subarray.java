class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int[] pre = new int[n + 1];

        for (int i = 0; i < n; i++) {
            pre[i + 1] = pre[i] + nums.get(i);
        }

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = l; j <= r; j++) {
                if (i + j <= n) {
                    int sum = pre[i + j] - pre[i];

                    if (sum > 0) {
                        ans = Math.min(ans, sum);
                    }
                }
            }
        }

        if (ans == Integer.MAX_VALUE)
            return -1;

        return ans;
    }
}