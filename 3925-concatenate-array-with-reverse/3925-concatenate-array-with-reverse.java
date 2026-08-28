class Solution {
    public int[] concatWithReverse(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int num : nums)
        {
          ans.add(num);   
        }
        for(int i = nums.length - 1; i >= 0; i--)
        {
             ans.add(nums[i]);
        }
     return ans.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}