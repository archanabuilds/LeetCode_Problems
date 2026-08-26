class Solution {
    public List<Integer> partitionLabels(String s) {

        HashMap<Character, Integer> last = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            last.put(s.charAt(i), i);
        }

        List<Integer> ans = new ArrayList<>();

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            end = Math.max(end, last.get(ch));

            if (i == end) {
                ans.add(end - start + 1);
                start = i + 1;
            }
        }

        return ans;
    }
}