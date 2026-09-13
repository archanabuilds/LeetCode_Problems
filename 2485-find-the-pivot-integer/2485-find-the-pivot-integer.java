class Solution {
    public int pivotInteger(int n) {
        int sum = 0;
        int[] prefix = new int[n + 1];
        for(int i = 0 ; i <= n ; i++)
        {
             sum += i;
             prefix[i] = sum;
        }
        for(int i = 1; i <= n; i++)
        {
            int lsum = prefix[i];
            int rsum = prefix[n] - prefix[i - 1];
            if(lsum == rsum)
             return i;
        }
        return -1;
    }
}