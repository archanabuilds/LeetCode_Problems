class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num : nums)
        {
            if(num % 2 == 0)
            hm.put(num,hm.getOrDefault(num,0)+ 1);
        }
        int ans = -1;
        int maxi = 0;
        for(Map.Entry<Integer,Integer> entry : hm.entrySet())
        {
            int n = entry.getKey();
            int freq = entry.getValue();
    
            if(freq > maxi)
            {
                 maxi = freq ;
                ans = n;
            }
            else if(freq == maxi && n < ans)
            ans = n;
        }
       return ans; 
    }
}