
import java.util.*;
import java.io.*;

public class Solution {
	//재료 선택 가능, 재료자체를 커스텀은 불가, 재료에는 점수 존재 
	//재료의 점수, 재료의 칼로리 주어짐  ... 정해진 칼로리 이하의 조합중 민기가 가장 선호하는 햄버거 
	//햄버거 선호도는 재료들의 점수의 합으로 결정, 같은 재료 중복 사용 X , 햄버거 조합의 제한은 칼로리 제외 X 
	/*입력 
	 * T
	 * N L 		// N : 재료의 수 , L :제한 칼로리 
	 * T K 		// T : 재료의 점수, K : 재료의 칼로리 
	 * 출력 
	 * #1 750 
	 */
	static int N, L; 
	static int[] score, cal; 
	static int maxScore; 
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		int T = Integer.parseInt(br.readLine()); 
		
		for(int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine()); 
			N = Integer.parseInt(st.nextToken());
			L = Integer.parseInt(st.nextToken());

			score = new int[N];
			cal= new int[N];
			
			for(int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				score[i] = Integer.parseInt(st.nextToken()); 
				cal[i] = Integer.parseInt(st.nextToken());
			}
			
			maxScore = 0; 
			dfs(0, 0, 0); 
			
			sb.append("#").append(tc).append(" ").append(maxScore).append("\n");
		}
		System.out.println(sb); 
	}
	static void dfs(int idx, int totalScore, int totalCal) {
		if(totalCal > L) return; 
		
		if(idx == N) {
			maxScore = Math.max(maxScore, totalScore); 
			return; 
		}
		
		dfs(idx + 1, totalScore + score[idx], totalCal + cal[idx]); 
		
		dfs(idx + 1, totalScore, totalCal);
	}
}
