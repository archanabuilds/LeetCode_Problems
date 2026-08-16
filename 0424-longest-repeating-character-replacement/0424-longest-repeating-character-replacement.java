class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int maxFreq = 0, left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            maxFreq = Math.max(maxFreq, hm.get(ch));

            int windowLen = right - left + 1;
            if (windowLen - maxFreq > k) {
                char rem = s.charAt(left);
                hm.put(rem, hm.get(rem) - 1);
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}