//1152 단어의 개수 
/*
import java.util.*;
import java.io.*;

public class Solve1130{ 
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		int count =0; 
		
		while(st.hasMoreTokens()) {
			st.nextToken();
			count++;
		}
		System.out.println(count); 
	}
}

//이게 시간 및 메모리 부분에서 우수
import java.util.*;
import java.io.*;

public class Solve1130{ 
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		
		System.out.println(st.countTokens()); 
	}
}
 */

//1157 단어 공부 
/*
import java.util.*;
import java.io.*;

public class Solve1130{ 
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26]; 
		String str = br.readLine(); 
		
		
		for(int i = 0; i < str.length(); i++) {
			if('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
				arr[str.charAt(i) - 'A' ]++; 
			}
			else {
				arr[str.charAt(i) - 'a']++; 
			}
		}
		int max = -1; 
		char ch = '?'; 
		
		for(int i = 0; i < 26; i++) {
			if(arr[i] > max) {
				max = arr[i]; 
				ch = (char)(i+65); 
			}
			else if(arr[i] == max) {
				ch = '?'; 
			}
		}
		System.out.println(ch);
	}
}
*/

//위와 같은 문제지만 BufferedReader를 사용하지 않고 System.in.read를 사용한 방법 
/* 출처 : https://st-lab.tistory.com/64 
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
 
		int[] arr = new int[26]; // 영문자의 개수는 26개임
 
		int c = System.in.read();
 
		while (c > 64) {	// 공백을 입력받는 순간 종료됨 
			
			if (c < 91) {
				arr[c - 65]++;
			} else {
				arr[c - 97]++;
			}
			c = System.in.read();
		}
 
 
		int max = -1;
		int ch = -2;	// ? 는 63 이다.
 
		for (int i = 0; i < 26; i++) {
 
			if (arr[i] > max) {
				max = arr[i];
				ch = i;
			} else if (arr[i] == max) {
				ch = -2;
			}
		}
		System.out.print((char) (ch+65));
	}
}
*/