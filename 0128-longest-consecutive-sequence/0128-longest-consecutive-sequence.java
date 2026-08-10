import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();

        //  Add all numbers to set
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        //  Check for sequence starts
        for (int num : set) {
            if (!set.contains(num - 1)) { // start of sequence
                int currentNum = num;
                int count = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}