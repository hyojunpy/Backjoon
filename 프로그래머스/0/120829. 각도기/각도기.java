class Solution {
    public int solution(int angle) {
        int answer = 0;
        
        answer = (angle < 90) ? 1 : (angle == 90 ) ? 2 : (angle < 180) ? 3 : (angle == 180) ? 4 : 0; 
        
        return answer;
    }
}