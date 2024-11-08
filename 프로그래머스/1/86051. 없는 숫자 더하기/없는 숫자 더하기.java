import java.util.*; 

class Solution {
    public int solution(int[] numbers) {
        int[] answer = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int result = 0; 
        
        
        for(int i = 0; i < answer.length; i++) {
            boolean torf = false; 
            for(int j = 0; j < numbers.length; j++) {
                if( answer[i] == numbers[j]) {
                    torf = true; 
                } 
            }
            if(!torf) {
                result += answer[i];            
            }
        }
        
        
        return result;
    }
}