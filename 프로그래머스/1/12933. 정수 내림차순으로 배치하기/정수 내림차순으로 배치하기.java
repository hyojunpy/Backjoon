import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0; 
        String s = "" + n; 
        Long arr[] = new Long[s.length()]; 
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); 
            arr[i] = (long)(ch - '0'); 
        }
        Arrays.sort(arr,Comparator.reverseOrder());
        for(int i = 0; i < arr.length; i++) { 
            answer *= 10; 
            answer += arr[i]; 
        }        
        return  answer;
        
    }
}