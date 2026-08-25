class Solution {
    public boolean judgeCircle(String moves) {
       int vcount = 0, hcount = 0;
       for(char ch : moves.toCharArray())
       {
        if(ch == 'U') vcount++;
        else if(ch == 'D') vcount--;
        else if(ch == 'L') hcount++;
        else if(ch == 'R') hcount--;
       }
        return hcount == 0 && vcount == 0;
    }
}