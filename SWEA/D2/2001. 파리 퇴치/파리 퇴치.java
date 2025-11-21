
import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine()); 
			int N = Integer.parseInt(st.nextToken()); 
			int M = Integer.parseInt(st.nextToken()); 
			
			int[][] arr = new int[N][N]; 
			
			for(int i= 0; i < N; i++) {
				st = new StringTokenizer(br.readLine()); 
				for(int j = 0; j < N; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken()); 
				}
			}
			
			int max = 0; 
			
			for(int i =0; i <= N-M; i++) {
				for(int j = 0; j <= N-M; j++) {
					int sum = 0; 
					
					for(int x = 0; x < M; x++) {
						for(int y = 0; y <M; y++){
							sum += arr[i+x][j+y];
						}
					}
					if(sum > max) {
						max = sum; 
					}
				}
			}
			sb.append("#").append(tc).append(" ").append(max).append("\n");
		}
		System.out.println(sb); 
	}
}
