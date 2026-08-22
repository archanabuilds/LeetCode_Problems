class Solution {
         int sumprodof(int n1)
        {
            int sum = 0 , prod = 1;
            while(n1 > 0)
            {
                int digit = n1 % 10;
                sum += digit;
                prod *= digit;
                n1 /= 10;
            }
            return sum + prod;
        }
    public boolean checkDivisibility(int n) {
      int div = sumprodof(n);
      return n % div == 0;
    }
}