class Solution {
    public int findNumbers(int[] nums) {
       int count = 0;
        for(int num : nums)
        {
            int evc = 0; 
            while(num > 0)
            {
              int digit = num % 10;
              evc++;
              num /=10;
            }
            if( evc % 2 == 0)
            {
                count++;
            }
        }
      return count; 
    }
}