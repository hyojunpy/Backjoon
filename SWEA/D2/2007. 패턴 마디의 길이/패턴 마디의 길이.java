
import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		int T = Integer.parseInt(br.readLine()); 
		
		// s에 대해 0부터 i까지 짤라서 점점 검색 이게 i+1.i+i까지의 문자열과 동일한지 검사 후 동일하다면 뒤에 계속 동일한 문자열이 몇번 나오는지
		for(int tc = 1; tc <= T; tc++) {
			String s = br.readLine(); 
			int ans = 0;
			for(int i = 1; i <= 10; i++) {
				String ss = s.substring(0, i);
				String sss = s.substring(i, i *2); 
				
				if(ss.equals(sss)) {
					ans = i; 
					break;
				}
			}
			sb.append("#").append(tc).append(" ").append(ans).append("\n");
		}
		System.out.println(sb);
	}
}