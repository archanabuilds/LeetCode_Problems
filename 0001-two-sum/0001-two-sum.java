
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            map.put(nums[i], i);
        }
        
       return new int[] {}; // will never reach here as per problem statement
    }
}

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//        HashMap <Integer, Integer> map=new HashMap<>();

//        for(int i=0;i<nums.length;i++)
//        int res=target-nums[i];

//        if(map.cantainskey(res)){
//        return new int[] {map.get(res),i};
//        }
//        map.put(nums[i],i);
//     }
//     retur new int[] {-1,-1};
// }