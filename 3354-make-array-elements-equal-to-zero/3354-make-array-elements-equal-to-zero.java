class Solution {
    public int countValidSelections(int[] nums) {
        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }

        int left = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int right = total - left;

                if (left == right) {
                    count += 2;
                } else if (Math.abs(left - right) == 1) {
                    count++;
                }
            } else {
                left += nums[i];
            }
        }

        return count;
    }
}
