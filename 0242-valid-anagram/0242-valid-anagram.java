
class Solution {
    public boolean isAnagram(String s, String t) {
        //Brute Approach
        if(s.length() != t.length())
        {
            return false;
        }
        // char[] sarray=s.toCharArray();
        // char[] tarray=t.toCharArray();
        // java.util.Arrays.sort(sarray);
        // java.util.Arrays.sort(tarray);
        // for(int i=0;i<s.length();i++)
        // {
        //     if(sarray[i]!=tarray[i])
        //     {
        //         return false;
        //     }
        // }
        // return true;
//optimal approach
//here we have used array of size 256 to consider both upper and lower cases

        int[] freq=new int[256];
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)]++;
        }
        for(int i=0;i<t.length();i++)
        {
            freq[t.charAt(i)]--;
        }
        for(int i=0;i<256;i++)
        {
            if(freq[i]!=0)
              return false;
        }
        return true;

    }
}
//same length, same frquency 