class Solution {
    public int maxDepth(String s) {
        int ans=0;
        int openb=0;
        for(Character c : s.toCharArray())
        {
            if(c=='(')
            {
                openb++;
            }
            else if(c==')')
            {
                openb--;
            }
            ans=Math.max(ans,openb);
        }
        return ans;
    }
}