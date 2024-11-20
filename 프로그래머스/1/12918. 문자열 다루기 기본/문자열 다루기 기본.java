class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() == 4 || s.length() == 6)
            for(int i = 0; i < s.length(); i++) {
                int a = s.charAt(i);
                if(65 <= a || a >= 122) {
                    answer = false; 
                }
        }
        else return false;
        
        return answer;
    }
}