class Solution {
    public int minimumDeletions(int[] nums) {

        if (nums.length <= 2)
            return nums.length;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }

        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max)
                maxIndex = i;

            if (nums[i] == min)
                minIndex = i;
        }

        int n = nums.length;

        int d1 = Math.max(maxIndex, minIndex) + 1;
        int d2 = n - Math.min(maxIndex, minIndex);

        int d3 = Math.min(maxIndex, minIndex) + 1
               + n - Math.max(maxIndex, minIndex);

        return Math.min(d1, Math.min(d2, d3));
    }
}