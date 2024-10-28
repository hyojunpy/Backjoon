class Solution {
    public int[] solution(long n) {
        String a = "" + n; 
        int[] answer = new int[a.length()];
        int b = 0; 
            
        while(n > 0) {
            answer[b] = (int)(n % 10); 
            n/= 10; 
            b++; 
        }
        return answer;
    }
}