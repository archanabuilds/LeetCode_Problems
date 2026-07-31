class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character,Integer> hs = new HashMap<>();
        char a = 'a';
   for(char ch : s.toCharArray())
   {
    hs.put(ch,hs.getOrDefault(ch,0)+1);
    if(hs.get(ch) == 2)
    {
        return ch;
    }
   }
   return a;
 }
}