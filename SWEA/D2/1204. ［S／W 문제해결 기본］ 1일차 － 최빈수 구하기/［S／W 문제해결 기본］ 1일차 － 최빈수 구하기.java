
import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= T; tc++) {
			br.readLine(); 
			StringTokenizer st = new StringTokenizer(br.readLine()); 
			int[] arr = new int[101];
			while(st.hasMoreTokens()) {
				int a = Integer.parseInt(st.nextToken()); 
				arr[a] += 1; 
			}
			
			int ans = 0; 
			int maxCnt = 0; 
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] > maxCnt) {
					ans = i; 
					maxCnt = arr[i];
				}else if(arr[i] == maxCnt && i > ans) {
					ans = i; 
				}
			}
			sb.append("#").append(tc).append(" ").append(ans).append("\n"); 
		}
		System.out.println(sb); 
	}
}
