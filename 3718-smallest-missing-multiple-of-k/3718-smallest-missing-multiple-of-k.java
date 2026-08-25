class Solution {
    public int missingMultiple(int[] nums, int k) {
        
        HashSet<Integer> hs = new HashSet<>();
        for(int num : nums)
        {
            hs.add(num);
        }
        for(int i = 1 ; ; i++)
        {
           if(!(hs.contains(i*k)))
           {
             return i * k;
             
           }
        }
    }
}