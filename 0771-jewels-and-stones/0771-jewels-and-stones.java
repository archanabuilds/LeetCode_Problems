class Solution {
    public int numJewelsInStones(String jewels, String stones) {
       HashMap<Character,Integer> hm = new HashMap<>();
       int count = 0;
       for(char ch : stones.toCharArray())
         hm.put(ch,hm.getOrDefault(ch,0)+1);
        
       for(char ch : jewels.toCharArray()) {
        if(hm.containsKey(ch))
         count += hm.get(ch);
       }
       return count;
    }
}