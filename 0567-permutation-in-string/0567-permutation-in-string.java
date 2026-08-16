class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k = s1.length();
        int left = 0;
         HashMap<Character,Integer> map1 = new HashMap<>();
         for(int i = 0; i < s1.length();i++)
         {
            char ch = s1.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
         }
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int right = 0; right < s2.length();right++)
        {
           char ch = s2.charAt(right);
           map2.put(ch,map2.getOrDefault(ch,0)+1);
           
           if(map1.equals(map2))
             {
                return true;
             }
           if(right - left + 1 == k)
           {
            char leftch = s2.charAt(left);
            map2.put(leftch,map2.get(leftch) - 1);
            left++;

             if(map2.get(leftch) == 0)
             {
                map2.remove(leftch);
             }

           }
        }
        
       return false; 
    }
}