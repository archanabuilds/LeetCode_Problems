class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();

        String[] words = paragraph.split("[!?',;. ]+");

        String ans = "";
        int max = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("")) {
                continue;
            }

            boolean found = false;

            for (int j = 0; j < banned.length; j++) {
                if (words[i].equals(banned[j])) {
                    found = true;
                    break;
                }
            }

            if (found) {
                continue;
            }

            int count = 0;

            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }

            if (count > max) {
                max = count;
                ans = words[i];
            }
        }

        return ans;
    }
}