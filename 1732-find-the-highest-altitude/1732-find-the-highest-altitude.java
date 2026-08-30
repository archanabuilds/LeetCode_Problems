class Solution {
    public int largestAltitude(int[] gain) {
        int maxi=0;
        int g=0;
        for(int i=0;i<gain.length;i++)
        {
            g +=gain[i];
           maxi=Math.max(g,maxi);
        }
        return maxi;
    }
}