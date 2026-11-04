class Solution {
    public int maxScore(String s) {
        int max = 0;

        for(int i = 1; i < s.length(); i++) {
            int zero = 0;
            int one = 0;

            for(int j = 0; j < i; j++) {
                if(s.charAt(j) == '0')
                    zero++;
            }

            for(int j = i; j < s.length(); j++) {
                if(s.charAt(j) == '1')
                    one++;
            }

            max = Math.max(max, zero + one);
        }

        return max;
    }
}