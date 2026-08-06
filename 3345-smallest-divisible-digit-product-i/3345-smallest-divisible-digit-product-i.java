class Solution {
    public int digitproduct(int x){
        int product = 1;
        while(x > 0)
        {
             int digit = x % 10;
             product = product * digit;
             x /= 10; 
        }
        return product;
    }
    public int smallestNumber(int n, int t) {
        while(digitproduct(n) % t != 0)
        {
            n++;  
        }
     return n;   
    }
}