//2738 복습 
/*
import java.util.*; 
import java.io.*; 

public class Solve1213{ 
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringBuilder sb = new StringBuilder(); 
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine()); 
			for(int j = 0; j < M; j++) {
				int a = arr[i][j] + Integer.parseInt(st.nextToken()); 
				sb.append(a + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
*/

//2741 복습 
/*
import java.io.*; 

public class Solve1213{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringBuilder sb = new StringBuilder(); 
		int N = Integer.parseInt(br.readLine());
		for(int i = 1; i <= N; i++) {
			sb.append(i + "\n"); 
		}
		System.out.println(sb);
	}
}
*/

//2743 복습
/*
import java.io.*; 

public class Solve1213{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(); 
		
		System.out.println(str.length());
	}
}
*/

//2744 복습 
/*
import java.io.*; 

public class Solve1213{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(); 
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(Character.isUpperCase(c)) {
				System.out.print(String.valueOf(c).toLowerCase());
			}
			else {
				System.out.print(String.valueOf(c).toUpperCase());	
			}
		}
	}
}
*/

//10250 ACM호텔 
/*
import java.io.*;
import java.util.*; 

public class Solve1213{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringBuilder sb = new StringBuilder(); 
		StringTokenizer st; 
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine()); 
			int H = Integer.parseInt(st.nextToken()); 
			st.nextToken();
			int N = Integer.parseInt(st.nextToken()); 
			
			int CH;
			int CW;
			if(N% H == 0) {
				CH = H; 
				CW = N/H;
				sb.append((CH * 100) + CW).append("\n");
			}
			else {
				CH = N % H;
				CW = N/H + 1; 
				sb.append((CH * 100) + CW).append("\n");
			}	
		}
		System.out.println(sb); 
	}
}
*/

//3052 나머지 		**** 복습 필요 
/*
import java.util.*; 
import java.io.*; 

public class Solve1213{
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		boolean[] arr = new boolean[42];
		
		for(int i = 0; i < 10; i++) { 
			arr[Integer.parseInt(br.readLine()) % 42] = true;
		}
		int count = 0; 
		for(boolean value : arr) {
			if(value) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
*/