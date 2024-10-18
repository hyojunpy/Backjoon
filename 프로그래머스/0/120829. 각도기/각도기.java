class Solution {
    public int solution(int angle) {
        int answer = 0;
        
        switch(angle) { 
        case 90 -> answer = 2; 
                case 180 -> answer = 4; 
                default -> answer = angle < 90 ? 1 : 3;
        }
        
        return answer;
    }
}