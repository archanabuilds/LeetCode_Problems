class Solution {
    public int maximumProduct(int[] nums) {
        int f = Integer.MIN_VALUE;
        int s = Integer.MIN_VALUE;
        int t = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {

            int n = nums[i];
            if (n >= f) {
                t = s;
                s = f;
                f = n;
            } 
            else if (n >= s) {
                t = s;
                s = n;
            } 
            else if (n > t) {
                t = n;
            }



            if (n <= min1) {
                min2 = min1;
                min1 = n;
            } 
            else if (n < min2) {
                min2 = n;
            }
        }

        return Math.max(f * s * t, f * min1 * min2);
    }
}