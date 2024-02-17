//10039 평균 점수 
//import java.util.*;
//import java.io.*; 
//
//
//public class Solve0216 {
//
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int num = 0; 
//		
//		for(int i = 0; i < 5; i++)
//		{
//			int a = Integer.parseInt(br.readLine()); 
//			if(a < 40) {
//				a = 40; 
//			}
//			num = num + a; 
//		}
//		System.out.println(num/5);
//	}
//
//}

//3046 R2 
//import java.util.*; 
//import java.io.*; 
//
//public class Solve0216{
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
//		StringTokenizer st = new StringTokenizer(br.readLine()); 
//		
//		int R1 = Integer.parseInt(st.nextToken()); 
//		int S = Integer.parseInt(st.nextToken()); 
//		
//		System.out.println((S * 2) - R1);
//	}
//}

////10808 알파벳 개수 
//import java.util.*;
//import java.io.*;
//
//public class Solve0216{
//	public static void main(String[] args) throws IOException{ 
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String a = br.readLine(); 
//		int arr[] = new int[26]; 
//		
//		for(int i = 0; i < a.length(); i++)
//		{
//			char c = a.charAt(i); 
//			arr[c - 97]++; 
//		}
//		
//		for( int i = 0; i < 26; i++)
//		{
//			System.out.print(arr[i] + " "); 
//		}
//		
//	}
//}

//5543 상근날드 
//import java.util.*; 
//import java.io.*; 
//
//public class Solve0216{ 
//	public static void main(String[] args) throws IOException { 
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
//		int arr1[] = new int[3]; 
//		int arr2[] = new int[2];
//		
//		for(int i = 0; i < arr1.length; i++) {
//			int n = Integer.parseInt(br.readLine()); 
//			arr1[i] = n; 
//		}
//			Arrays.sort(arr1);
//		for(int i = 0; i < arr2.length; i++) {
//			int n = Integer.parseInt(br.readLine()); 
//			arr2[i] = n; 
//		}
//			Arrays.sort(arr2);
//		System.out.println((arr1[0] + arr2[0]) - 50); 
//	}
//}

////10101 삼각형 외우기  // 한번 더 
//import java.util.*; 
//import java.io.*; 
//
//public class Solve0216{ 
//	public static void main(String[] args) throws IOException 
//	{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n1 = Integer.parseInt(br.readLine()); 
//		int n2 = Integer.parseInt(br.readLine()); 
//		int n3 = Integer.parseInt(br.readLine()); 
//		
//		if((n1 + n2 + n3) != 180){
//			System.out.println("Error");
//		}
//		else{
//			if(n1 == 60 && n2 == 60 && n3 == 60) {
//				System.out.println("Equilateral");
//			}
//			else if(n1 == n2 || n2  == n3||n1 == n3)
//			{
//			System.out.println("Isosceles");
//			}
//			else {
//			System.out.println("Scalene");
//			}
//		}
//	}
//}

//2530 인공지능 시계 // 한번더 
//import java.util.*; 
//import java.io.*; 
//
//public class Solve0216{
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st  = new StringTokenizer(br.readLine());
//		StringBuilder sb = new StringBuilder(); 
//		
//		int h = Integer.parseInt(st.nextToken());
//		int m = Integer.parseInt(st.nextToken());
//		int s = Integer.parseInt(st.nextToken());
//		int sec = Integer.parseInt(br.readLine()); 
//		
//		s += sec; 
//		m += (s/60); 
//		s = s % 60; 
//		h += (m/60); 
//		m = m % 60; 
//		h = h % 24; 
//		
//		sb.append(h + " " + m + " " + s + " ");
//		System.out.println(sb); 
//	}
//}

//10430 나머지 
//import java.util.*; 
//import java.io.*; 
//
//public class Solve0216{ 
//	public static void main(String[] args) throws IOException{ 
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
//		StringTokenizer st = new StringTokenizer(br.readLine()); 
//		StringBuilder sb = new StringBuilder(); 
//		
//		int A = Integer.parseInt(st.nextToken());
//		int B = Integer.parseInt(st.nextToken());
//		int C = Integer.parseInt(st.nextToken());
//		
//		sb.append((A + B) % C + "\n").append(((A % C) + (B % C)) % C + "\n").append((A * B ) % C + "\n").append(((A % C) * (B % C)) % C);
//		System.out.println(sb); 
//	}
//}

////4375번 1 
//기술적 풀이 
import java.util.*;
import java.io.*;
import java.math.*;

public class Solve0216{
	public static void main(String[] args) throws IOException, NumberFormatException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		String s = ""; 
		StringBuilder sb = new StringBuilder(); 
		
		while((s = br.readLine()) != null) {
			BigInteger n = new BigInteger(s);
			BigInteger base = BigInteger.ZERO;
			while(true) {
				base = base.multiply(BigInteger.TEN).add(BigInteger.ONE);
				if(base.mod(n).equals(BigInteger.ZERO)) {
					sb.append(base.toString().length() + "\n"); 
					break;
				}
			}
		}
		System.out.println(sb);
	}
}

//수학적 풀이 
//import java.util.*;
//import java.io.*;
//
//public class Solve0216{
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
//		StringBuilder sb = new StringBuilder(); 
//		String s;
//		
//		while((s = br.readLine()) != null) {
//			int n = Integer.parseInt(s); 
//			int base = 1; 
//			int cnt = 1;
//			
//			while((base = base %n ) != 0) {
//				cnt++; 
//				base = base *10 +1; 
//			}
//			sb.append(cnt).append("\n");  
//		}
//		System.out.print(sb);
//	}
//}