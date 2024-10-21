import java.util.*; 

class Solution {
	public int solution(int n) {
		int answer = 0;

        if(0 < n && n <= 3000){ 
            for (int i = 1; i <= n / 2; i++) { 
                if (n % i == 0) 
                    answer += i;
            }
        }
		return answer + n; 
	}
}