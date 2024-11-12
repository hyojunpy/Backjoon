class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        while(left <= right) {
        int count = 0;
            for (int i = 1; i * i <= left; i++) {
        	    if (i * i == left) count++;
	            else if (left % i == 0) count += 2;
                }
            if(count % 2 == 0) {
                answer += left; 
            }else {
                answer -= left;
            }
            left += 1; 
        }



        
        return answer;
    }
}