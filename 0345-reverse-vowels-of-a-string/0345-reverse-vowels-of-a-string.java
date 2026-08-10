class Solution {
    public boolean isv(char c) {
       return c =='a' || c =='i'|| c == 'e' || c == 'o' || c =='u' || c == 'A' || c == 'O' || c =='E' || c == 'I' || c =='U' ;
       
    }

    public String reverseVowels(String s)
     {
        char[] arr = s.toCharArray();
        int i = 0 , j = s.length() - 1;
        while( i < j)
        {
            if(isv(arr[i]) && isv(arr[j])) 
            {
                char temp =arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
           else if(isv(arr[i]) && !isv(arr[j])) 
            { 
                j--;
            }
           else if(!isv(arr[i]) && isv(arr[j])) 
            { 
               i++;
            }
           else 
            { 
               i++;
               j--;
            }    
        }
    return new String(arr);
     }
}