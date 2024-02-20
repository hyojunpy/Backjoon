//24262 알고리즘 수업 - 알고리즘의 수행시간 1
//import java.util.*; 
//import java.io.*; 
//
//public class Solve0220 {
//
//	public static void main(String[] args) {
//		System.out.println('1');
//		System.out.println('0');
//	}
//
//}

//4999 아! 
//import java.util.*;
//import java.io.*;
//
//public class Solve0220 {
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		String s = br.readLine(); 
//		int a = 0; 
//		
//		for(int i = 0; i < s.length(); i++) {
//			if(s.charAt(i) == 'h') {
//				a += i; 
//			}
//		}
//		
//		s = br.readLine();
//		
//		for(int i = 0; i < s.length(); i++) {
//			if(s.charAt(i) == 'h') {
//				if(a < i) System.out.print("no");
//				else System.out.print("go");
//			}
//		}
//	}
//}

//10170 NFC West vs North 
//import java.util.*;
//import java.io.*;
//
//public class Solve0220 {
//	public static void main (String[] args) throws IOException  {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
//		StringBuilder sb = new StringBuilder(); 
//		
//		sb.append("NFC West       W   L  T\n" + 
//				"-----------------------\n" + 
//				"Seattle        13  3  0\n" + 
//				"San Francisco  12  4  0\n" + 
//				"Arizona        10  6  0\n" + 
//				"St. Louis      7   9  0\n" + 
//				"\n" + 
//				"NFC North      W   L  T\n" + 
//				"-----------------------\n" + 
//				"Green Bay      8   7  1\n" + 
//				"Chicago        8   8  0\n" + 
//				"Detroit        7   9  0\n" + 
//				"Minnesota      5  10  1"); 
//		
//		System.out.print(sb);
//	}
//}

//5523 방학 숙제 
//import java.util.*;
//import java.io.*;
//
//public class Solve0220{ 
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int L = Integer.parseInt(br.readLine());	//총 방학일수 
//		int A = Integer.parseInt(br.readLine());	// 총 국어 페이지
//		int B = Integer.parseInt(br.readLine());	// 총 수학 페이지
//		int N = Integer.parseInt(br.readLine()); 	// 하루 국어 페이지
//		int M = Integer.parseInt(br.readLine());	// 하루 수학 페이지 
//		
//		if(A/N > B/M) {
//			if(A % N != 0) {
//				System.out.print(L - A/N - 1);					
//			}
//			else System.out.print(L - A/N);					
//		}		
//		else	
//			if(B % M != 0) {
//				System.out.print(L - B/M - 1);					
//			}
//			else System.out.print(L - B/M);					
//	}
//} double 형으로 변환하여 둘 중 최대값을 구한 후 math.celi 라는 소숫점자리 올림 함수를 이용한 방법도 있었음 

//5596 시험 점수 
//import java.util.*;
//import java.io.*;
//import java.math.*;
//
//public class Solve0220{ 
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st; 
//		
//		int arr[] = new int[2]; 
//		
//		for(int i = 0; i < 2; i++) {
//			st = new StringTokenizer(br.readLine()); 
//			for(int j = 0; j < 4; j++) {
//				int n = Integer.parseInt(st.nextToken()); 
//				arr[i] += n;
//			}
//		}		
//		System.out.print(Math.max(arr[0], arr[1])); 
//	}
//}