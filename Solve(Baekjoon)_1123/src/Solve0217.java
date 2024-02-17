//1037 약수  //한번 더 
//import java.util.*;
//import java.io.*;
//
//public class Solve0217 {
//
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
//		
//		int T = Integer.parseInt(br.readLine()); 
//		int max = Integer.MIN_VALUE; 
//		int min = Integer.MAX_VALUE; 
//		
//		StringTokenizer st = new StringTokenizer(br.readLine()); 
//		while(T-- > 0) {
//			int N = Integer.parseInt(st.nextToken()); 
//			max = N > max ? N : max; 
//			min = N < min ? N : min; 	
//		}	
//		System.out.print(max * min);
//	}
//}


// 4375번 1 || 수학적 풀이
//import java.util.*; 
//import java.io.*; 
//import java.math.*; 
//
//public class Solve0217{ 
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder(); 
//		String s = ""; 
//		int cnt = 1; 
//		
//		while((s = br.readLine()) != null) {
//			int n = Integer.parseInt(s);
//			int base = 1; 
//			
//			while((base = base % n ) != 0) {
//				cnt++; 
//				base = base * 10 + 1; 
//			}
//		}
//		sb.append(cnt).append("\n"); 
//		System.out.print(sb);
//	}
//}
// 4375 1 || 기술적 풀이
//import java.util.*;
//import java.io.*;
//import java.math.*;
//
//public class Solve0217{ 
//	public static void main(String[] args) throws IOException { 
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder(); 
//		String s = ""; 
//
//		while((s = br.readLine()) != null) {
//			BigInteger n = new BigInteger(s); 
//			BigInteger base = BigInteger.ZERO; 			
//			while(true) {
//				base = base.multiply(BigInteger.TEN).add(BigInteger.ONE); 
//				if(base.mod(n).equals(BigInteger.ZERO)) {
//					sb.append(base.toString().length() + "\n"); 
//					break; 
//				}
//			}
//		}
//		System.out.print(sb);
//	}
//}

//10797번 10부제 
//import java.util.*; 
//import java.io.*; 
//
//public class Solve0217{
//	public static void main(String[] args) throws IOException{ 
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
//		StringTokenizer st; 
//		
//		int D =  Integer.parseInt(br.readLine()); 
//		st = new StringTokenizer(br.readLine()); 
//		int cnt = 0;
//		
//		for(int i = 0; i < 5; i++) {
//			int num = Integer.parseInt(st.nextToken());
//			if(D == num) cnt++; 			
//		}
//		
//		System.out.print(cnt);
//	}
//}

//10158 과자 
//import java.util.*;
//import java.io.*;
//
//public class Solve0217{
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		
//		int K = Integer.parseInt(st.nextToken());
//		int N = Integer.parseInt(st.nextToken());
//		int M = Integer.parseInt(st.nextToken());
//		int result = 0; 
//		
//		if((K * N) < M) result = 0; 
//		else result = (K * N) - M; 
//		
//		System.out.print(result);
//	}
//}

//2845 파티가 끝나고 난 뒤 
//import java.util.*;
//import java.io.*;
//
//public class Solve0217{
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
//		StringTokenizer st = new StringTokenizer(br.readLine()); 
//		StringBuilder sb = new StringBuilder(); 
//
//		int L = Integer.parseInt(st.nextToken()); // 1m2 당 사람의 수 
//		int P = Integer.parseInt(st.nextToken()); // 파티가 열린 곳의 넓이 
//		
//		st = new StringTokenizer(br.readLine());
//		for (int i = 0; i < 5; i++) {
//			int result = (L*P) - Integer.parseInt(st.nextToken());
//			sb.append(result * -1 + " ");
//		}
//		System.out.print(sb);
//	}
//}

//5554 심부름 가는 길 
//import java.util.*;
//import java.io.*;
//
//public class Solve0217{
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder(); 
//		int sec = 0; 
//		
//		for(int i = 0; i < 4; i++) {
//			sec = sec + Integer.parseInt(br.readLine()); 
//		}
//		sb.append(sec/60 + "\n").append(sec % 60 ); 
//		System.out.print(sb);
//	}
//}

//2588 곱셈
import java.util.*;
import java.io.*;

public class Solve0217{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		
		int s1 = Integer.parseInt(br.readLine()); 
		String s2 = br.readLine(); 
		/* 		// 다른 방법
		for(int i = s2.length() -1 ; i >= 0; i--) {
			sb.append(s1 * (s2.charAt(i) - '0') + "\n");
		}
		sb.append(s1 * Integer.parseInt(s2)); 
		
		System.out.print(sb); 
		*/ 
		
		int result = 0; 
		
		for(int i = 0; i < s2.length(); i++) {
			 int N = s1 * (s2.charAt(2 - i) -'0'); 
			 sb.append(N + "\n"); 
			 if(i == 1) {
				 result += N * 10;
			 }
			 else if(i == 2) {
				 result += N * 100;				 
			 }
			 else result += N; 
		}
		sb.append(result); 
		System.out.print(sb); 
	}
}


