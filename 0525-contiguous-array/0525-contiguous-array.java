class Solution {
    public int findMaxLength(int[] nums) {

        int n = nums.length;

        int[] ones = new int[n];
        int[] zeroes = new int[n];

        int zeroc = 0;
        int onec = 0;

        for (int i = 0; i < n; i++) {

            if (nums[i] == 0) {
                zeroc++;
            }
            zeroes[i] = zeroc;

            if (nums[i] == 1) {
                onec++;
            }
            ones[i] = onec;
        }

        HashMap<Integer, Integer> hm = new HashMap<>();

        int max = 0;

        // difference = ones - zeroes
        // difference 0 exists before the array starts
        hm.put(0, -1);

        for (int i = 0; i < n; i++) {

            int diff = ones[i] - zeroes[i];

            if (hm.containsKey(diff)) {

                int length = i - hm.get(diff);

                max = Math.max(max, length);

            } else {

                // Store ONLY the first occurrence
                hm.put(diff, i);
            }
        }

        return max;
    }
}