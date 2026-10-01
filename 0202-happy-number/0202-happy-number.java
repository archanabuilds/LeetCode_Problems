class Solution {
   public int digitSum(int num)
    {
        int sum = 0;
        while(num > 0)
        {
            int digit = num % 10;
            sum += (digit * digit);
            num /= 10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        int ans = 0;
        
          ans = digitSum(n);
          while(ans != 1 && !seen.contains(ans))
          {
            seen.add(ans);
           ans =  digitSum(ans);
          }
        return ans == 1;
    }
}