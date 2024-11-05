class Solution {
    public String solution(String[] seoul) {
        int cnt = 0; 
        
        for(String answer : seoul) {
            if(answer.equals("Kim")) {
                break;    
            }
            cnt++; 
        }
        String answer = "김서방은 " + cnt + "에 있다";
        return answer;
    }
}