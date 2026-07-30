class Solution {
    public int digit(int n) {
        int sum = 0;
        while (n > 0) {
            int dig = n % 10;
            sum += dig;
            n /= 10;
        }
        return sum;
    }

    public int addDigits(int num) {
        if (num == 0)
            return 0;
        int ans = digit(num);
        while (ans >= 10) {
            ans = digit(ans);
        }
        return ans;
    }
}