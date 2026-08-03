class Solution {
    public int maxVowels(String s, int k) {
        int left = 0;
        int count = 0;
        int maxi = 0;
        for(int right = 0; right < s.length() ; right++)
        {
            char ch = s.charAt(right);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u')
            {
                count++;
            }
            if(right >= k - 1)
            {
               maxi =  Math.max(maxi,count);

               char leftchar = s.charAt(left);
               if(leftchar == 'a' || leftchar == 'e' || leftchar == 'i' || leftchar == 'o' || leftchar =='u')
               {
                count--;
               }

                left++;
       
            }
        }
        return maxi;
    }
}