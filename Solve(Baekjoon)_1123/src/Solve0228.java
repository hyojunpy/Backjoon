// OX퀴즈

//import java.util.*;
//import java.io.*;
//
//public class Solve0228 {
//
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder(); 
//		int TC = Integer.parseInt(br.readLine()); 
//		
//		for(int i = 0; i < TC; i++) {
//			String s = br.readLine(); 
//			int score = 0; 
//			int result = 0;
//
//			for(int j = 0; j < s.length(); j++) {
//				char ch = s.charAt(j);
//				if(ch == 'O') {
//					score += 1; 
//				}
//				else if(ch == 'X') score = 0; 
//			
//				result += score; 
//			}
//			sb.append(result + "\n"); 
//		}
//		System.out.print(sb);
//	}
//}

//2920 음계 

import java.util.*;
import java.io.*;

public class Solve0228{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); 
		StringTokenizer st = new StringTokenizer(s, " "); 
		
		int arr1[] = new int[8]; 
		int arr2[] = new int[8]; 
		int arr3[] = new int[8];
		int count = 0; 
		
		for(int i = 0; i < 8; i++) {
			arr1[i] = i + 1;
		}
		for(int i = 0; i < 8; i++) {
			arr2[i] = 8 - i;
		}
		
		for(int i = 0; i < 8; i++) {
			arr3[i] = Integer.parseInt(st.nextToken()); 
		}
		
		for(int i = 0; i < 8; i++) {
			if(arr1[i] == arr3[i]) count++;
			else if(arr2[i] == arr3[i]) count--;
		}
		
		if(count == 8) System.out.print("ascending");
		else if(count == -8) System.out.print("descending");
		else System.out.print("mixed");
	}
}