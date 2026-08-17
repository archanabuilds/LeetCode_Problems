class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || 
            t.length() == 0 || s.length() < t.length()) {
            return "";
        }

        int[] map = new int[128];
        int count = t.length();
        int start = 0;
        int end = 0;
        int minLen = Integer.MAX_VALUE;
        int startIndex = 0;

        for (char c : t.toCharArray()) {
            map[c]++;
        }

        char[] chS = s.toCharArray();
        while (end < chS.length) {

            if (map[chS[end]] > 0) {
                count--;
            }

            map[chS[end]]--;
            end++;

            while (count == 0) 
            {
                if (end - start < minLen) {
                    minLen = end - start;
                    startIndex = start;
                }

                map[chS[start]]++;

                if (map[chS[start]] > 0) {
                    count++;
                }
                start++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }
        return new String(chS, startIndex, minLen);
    }
}