class Solution {
    public int reverseDegree(String s) {
        int prodsum = 0;
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            prodsum += (i + 1) *(26 - (ch - 'a'));
        }
        return prodsum;
    }
}