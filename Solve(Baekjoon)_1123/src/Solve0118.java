//2439 별찍기 -2 
//import java.io.*;
//import java.util.*; 
//
//public class Solve0118 {
//
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder(); 
//		int N = Integer.parseInt(br.readLine()); 
//		
//		for(int i = 1; i <= N; i++)
//		{
//			for(int j = 1; j <= N - i ; j++) { 
//				sb.append(" ");
//			}
//			for(int k = 1; k <= i; k++)
//			{
//				sb.append("*");
//			}
//			
//			sb.append("\n"); 
//		}
//		System.out.print(sb);
//		
//	}
//}


// 2480 주사위 세개 
//// 비교하는 방식을 잘 생각해볼것
//import java.util.*;
//import java.io.*;
//
//public class Solve0118 {
//	public static void main(String[] args) throws IOException{ 
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
//		StringTokenizer st = new StringTokenizer(br.readLine()); 
//		StringBuilder sb = new StringBuilder(); 
//
//		int a = Integer.parseInt(st.nextToken());
//		int b = Integer.parseInt(st.nextToken());
//		int c = Integer.parseInt(st.nextToken());
//		int M = 0; 
//		
//		if(a != b && b != c && a != c) {
//			if( a < b && c < b) {
//				M = b;
//			}
//			else if( b < c && a < c) {
//				M = c; 
//			}
//			else M = a; 
//			
//			System.out.println(M * 100);
//		}
//		else {
//			if(a == b && b == c) {
//				System.out.println(10000 + a * 1000);
//			}
//			else {
//				if(a == b || a == c) {
//					System.out.println(1000 + a * 100);
//				}
//				else{
//					System.out.println(1000 + b * 100);
//				}
//			}
//		}
//	}
//}


////2440 별찍기 -3
//import java.util.*; dsadas
//import java.io.*; 
//
//public class Solve0118{ 
//	public static void main(String[] args) throws IOException{ 
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
//		int N = Integer.parseInt(br.readLine());
//		StringBuilder sb = new StringBuilder(); 
//		
//		for(int i = 1; i <= N; i++) {
//			for(int j = 0; j <= N - i ; j++) {
//				sb.append('*');
//			}
//			sb.append('\n');
//		}
//		System.out.print(sb);
//	}
//}


////25304 영수증 
//import java.util.*;
//import java.io.*;
//
//public class Solve0118{ 
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st;
//		int X = Integer.parseInt(br.readLine()); 
//		int N = Integer.parseInt(br.readLine()); 
//		int Z = 0; 
//		
//		for(int i = 0; i < N; i++) {
//			st = new StringTokenizer(br.readLine()); 
//			int a = Integer.parseInt(st.nextToken()); 
//			int b = Integer.parseInt(st.nextToken()); 
//			int Y = a * b;
//			Z = Z + Y; 
//		}
//		if(Z == X) System.out.println("Yes"); 
//		else System.out.println("No");
//	}
//}