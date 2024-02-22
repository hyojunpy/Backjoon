//26263 알고리즘 수업 - 알고리즘의 수행시간 2
//import java.util.*;
//import java.io.*;
//
//public class Solve0222 {
//
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
//		
//		int n = Integer.parseInt(br.readLine()); 
//		
//		System.out.println(n);
//		System.out.println(1);		
//	}
//}

//5717 상근이의 친구들 
//import java.util.*;
//import java.io.*;
//
//public class Solve0222{
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
//		StringBuilder sb = new StringBuilder(); 
//		StringTokenizer st; 
//	
//		while(true) {
//			st = new StringTokenizer(br.readLine()); 
//			
//			int F = Integer.parseInt(st.nextToken()); 
//			int M = Integer.parseInt(st.nextToken()); 
//			
//			if(F == 0 && M == 0) break;
//
//			sb.append(F + M + "\n");
//		}
//		System.out.print(sb);
//	}
//}

//11365 !밀비 급일 
//import java.util.*;
//import java.io.*;
//
//public class Solve0222{
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
//		StringBuilder sb = new StringBuilder(); 
//		
//		while(true) {
//			String s = br.readLine(); 
//			if(s.equals("END")) break;
//			StringBuilder sb1 = new StringBuilder(s);
//			sb1 = sb1.reverse(); 
//			sb.append(sb1 + "\n"); 
//		}
//		System.out.print(sb);
//	}
//}

//9316 Hello judge 
//import java.util.*;
//import java.io.*;
//
//public class Solve0222{
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
//		StringBuilder sb = new StringBuilder(); 
//		int T = Integer.parseInt(br.readLine()); 
//		
//		for(int i = 1; i < T + 1; i++) {
//			sb.append("Hello World, Judge " + i + "!" + "\n"); 
//		}
//		System.out.print(sb);
//	}
//}

//2441 별 찍기 -4 
//import java.util.*;
//import java.io.*;
//
//public class Solve0222{
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
//		StringBuilder sb = new StringBuilder();
//		int N = Integer.parseInt(br.readLine()); 
//		
//		for(int i = 0; i < N; i++) {
//			
//			for(int k = 0; k < i; k++) {
//				sb.append(" "); 
//			}
//			
//			for(int j = i; j < N; j++) {
//				sb.append("*"); 
//			}
//			sb.append("\n"); 
//			
//		}
//		System.out.print(sb);
//	}
//}

//31428 엘리스 트랙 매칭 
//import java.util.*;
//import java.io.*;
//
//public class Solve0222{
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
//		StringTokenizer st;
//		
//		int N = Integer.parseInt(br.readLine()); 
//		st = new StringTokenizer(br.readLine()); 
//		String s = br.readLine(); 
//		
//		int count = 0; 
//		
//		for(int i = 0; i < N; i++) {
//			if(st.nextToken().equals(s)) {
//				count++; 
//			}
//		}
//		System.out.print(count);
//	}
//}

//31416 가상 검증 기술  //미완
import java.util.*; 
import java.io.*; 
import java.math.*; 

public class Solve0222{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st; 
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine()); 
			
			int TA = Integer.parseInt(st.nextToken()); 
			int TB = Integer.parseInt(st.nextToken()); 
			int VA = Integer.parseInt(st.nextToken()); 
			int VB = Integer.parseInt(st.nextToken()); 
			
			int TBVB = TB * VB; 
			int TAVA = TA * VA; 
			
			if(TBVB < TAVA) {
				// TAVA - TBVB의 시간에 TAVA가 몇번 시도했는지 구한다. 
				// 시도한 횟수를 VA에서 뺸다. 
				// TBVB의 값에 
			}
			else System.out.print(TBVB);
		}
	}
}