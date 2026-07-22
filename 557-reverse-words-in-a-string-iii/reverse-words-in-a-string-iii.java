class Solution {
    public String reverseWords(String s) {
        int start = 0;
        char[] ch = s.toCharArray();
        for(int i = 0; i <= ch.length;i++)
        {
            if(i == ch.length || ch[i] == ' ')
            {
                int end = i-1;
              int left = start;
              int right = end;
               while(left < right)
              {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
              }
              start = i+1;
            }   
        }
        return new String(ch);
    }
}