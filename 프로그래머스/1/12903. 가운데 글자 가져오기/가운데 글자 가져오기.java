class Solution {
    public String solution(String s) {
        String answer = "";
        if(s.length() % 2 == 1) {
           return Character.toString(s.charAt(s.length()/2));
        }
        else {
            return s.substring((s.length()/2)-1, (s.length()/2)+1 );
        }
    }
}