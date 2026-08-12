class Solution {
    public int findUnsortedSubarray(int[] nums) {

     int maxi = Integer.MIN_VALUE;
     int end = -1;
        for(int i = 0; i < nums.length; i++)
     {
        maxi = Math.max(nums[i],maxi);
        if(nums[i] < maxi)
        {
            end = i;
        }
     }
    int min = Integer.MAX_VALUE;
    int begin = -1;
    for(int i =nums.length - 1; i >= 0; i--)
    {
        min = Math.min(nums[i],min); 
        if(nums[i] > min)
        {
            begin = i;
        }
    }
  // edge case if the array is already sorted the end remains same
    if(end == -1) 
    {
        return 0;
    }
    return end - begin + 1;
    }
}