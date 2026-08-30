class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max = 0;
        int[] ans = new int[k];

        for (int i = 0; i < nums.length; i++)
         {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
            max = Math.max(hm.get(nums[i]), max);
        }

        for (int i = 0; i < k; i++)
         {
            int num = 0;

            for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
                if (entry.getValue() == max) {
                    num = entry.getKey();
                    ans[i] = num;
                    break;
                }
            }
            hm.remove(num);

            max = 0;

            for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
                max = Math.max(entry.getValue(), max);
            }
        }
        return ans;
    }
}