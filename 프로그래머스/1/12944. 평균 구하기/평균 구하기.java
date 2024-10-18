class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        if(1 < arr.length && arr.length <= 100) { 
            for(int arrnum : arr) { 
                if(-10000 <= arrnum && arrnum <= 10000) {
                    answer += arrnum;
                }
            }
            answer /= arr.length; 
        }
        
        return answer;
    }
}