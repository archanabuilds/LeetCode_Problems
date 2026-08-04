class Solution {
    public List<Integer> findMissingElements(int[] nums) {
         List<Integer> ans = new ArrayList<>();
         HashSet<Integer> hs = new HashSet<>();
        
        int maxi = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

       for(int i = 0; i < nums.length; i++)
       {
        hs.add(nums[i]);
        maxi = Math.max(nums[i],maxi);
        min = Math.min(nums[i],min);
       }      

       for(int i = min ; i <= maxi ; i++)
       {
        if(!hs.contains(i))
          ans.add(i);
       }
     return ans;
    }
}