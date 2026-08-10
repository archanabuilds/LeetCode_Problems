class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer> pmap = new HashMap<>();
         HashMap<Character,Integer> wmap = new HashMap<>();
         List<Integer> ans = new ArrayList<>();

         for(char ch : p.toCharArray())
         {
            pmap.put(ch,pmap.getOrDefault(ch,0)+1);
         }

        int left = 0;
        int k = p.length();
        for(int right = 0; right < s.length();right++)
        {
            char ch = s.charAt(right);
            wmap.put(ch,wmap.getOrDefault(ch,0)+1);
            if(wmap.equals(pmap))
            ans.add(left);

            if(right >= k-1)
            {
                char remove = s.charAt(left);
                wmap.put(remove,wmap.get(remove)-1);
                if(wmap.get(remove) == 0)
                {
                    wmap.remove(remove);
                }
                left++;
            }
        } 
         
      return ans;
    }
}