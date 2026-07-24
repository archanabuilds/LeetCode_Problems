class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        
        for (int i = 0; i < arr.length; i += 2 * k) {
            int start = i;
            // Ensure the end pointer does not exceed the array bounds
            int end = Math.min(i + k - 1, arr.length - 1);
            
            // Reverse the first k characters of the current 2k block
            while (start < end) {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        
        return new String(arr);
    }
}
