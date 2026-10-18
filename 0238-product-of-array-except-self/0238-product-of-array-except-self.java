class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        
        int[] ans = new int[n];
        int[] pre = new int[n];
        int[] suf = new int[n];

        int sum = 1;
        pre[0] = 1;
        for(int i = 1; i < n; i++)
        {
            sum *= nums[i - 1];
            pre[i] = sum;
        }

        int bsum = 1;
        suf[n - 1] = 1;
        for(int i = n - 2; i >= 0; i--)
        {
            bsum *= nums[i + 1];
            suf[i] = bsum;
        }
        
        for(int i = 0; i < n; i++)
        {
            ans[i] = pre[i] * suf[i];
        }

        return ans;
    }
}