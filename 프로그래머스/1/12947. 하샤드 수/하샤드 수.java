class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String s = "" + x; 
        int a = 0;
        for(int i = 0; i < s.length(); i++) { 
            a += s.charAt(i) - '0';
        }
        if(x % a != 0) answer = false;
        
        return answer;
    }
}