class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        if(1 <= arr.length && arr.length <= 100) {
            for(int i : arr) {
                if(-10000 <= i && i <= 10000) { 
                    answer += i; 
                }
            }
            answer /= arr.length;
        }
        return answer;
    }
}