class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(""); 
        int cnt = 0; 
        
        for(String s1 : str) {
            if(s1.contains(" ")) {
                cnt = 0; 
            }else 
                cnt++; 
            if(cnt % 2 == 0) {
                answer += s1.toLowerCase();
            }
            else answer += s1.toUpperCase(); 
        }
        
        
        return answer;
    }
}