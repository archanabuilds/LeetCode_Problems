class Solution {
    public int maxPower(String s) {
    int left = 0, right = 1,count = 1 , maxi = 1;

    while(right < s.length())
    {
       if(s.charAt(left) == s.charAt(right))
       {
         right++;
         count++;
       }
       else{
        count = 1;
        left = right;
        right++;
       }
      maxi = Math.max(maxi , count);
    }
    return maxi;
    }
}
      //     int count = 0 , maxi = 0;
    //     for(int i = 0; i < s.length()  ; i++)
    //     {
    //         char ch = s.charAt(i);
    //        // char temp = ch;
    //         if(s.charAt(i) == s.charAt(i+1)) count++;
    //         else count = 0;

    //        maxi = Math.max(count , maxi);
    //     }
    //  return maxi;
