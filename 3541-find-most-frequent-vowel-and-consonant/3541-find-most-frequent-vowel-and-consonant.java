class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> hsv = new HashMap<>();
        HashMap<Character, Integer> hsc = new HashMap<>();
        int mv = 0, mc = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                hsv.put(ch, hsv.getOrDefault(ch, 0) + 1);
                mv = Math.max(hsv.get(ch), mv);
            }

            else {
                hsc.put(ch, hsc.getOrDefault(ch, 0) + 1);
                mc = Math.max(hsc.get(ch), mc);
            }
        }
        return mv + mc;
    }
}