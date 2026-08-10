class Solution {
    public boolean isSubsequence(String s, String t) {
        int left = 0;
        for(int i = 0;i < t.length() ; i++)
            {
                if(left < s.length() && t.charAt(i) == s.charAt(left))
                {
                    left++;
                }
            }
        if(left == s.length())
            return true;
        return false;
    }
}