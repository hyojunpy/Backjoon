class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        if(-10000000 <= n &&n <= 10000000) {
        for(int i = 0; i < n; i++) {  
                    answer[i] = (long) x * (i + 1); 
                    }        
        }    
        return answer;
    }
}