
//2475 검증수
/*
import java.util.*; 
import java.io.*; 

public class Solve1129{ 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        
        while(st.hasMoreTokens()){
            int a = Integer.parseInt(st.nextToken()); 
            sum += (a*a);
        }
        sb.append(sum % 10);
        System.out.println(sb);
    }
}
*/

//2562 최대값 
/*
import java.util.*; 
import java.io.*; 

public class Solve1129{ 
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num; 
		int max = 0; 
		int count = 0; 
		
		for(int i = 1; i < 10; i++)
		{
			num = Integer.parseInt(br.readLine()); 
			if(max < num) {
				max = num; 
				count = i; 
			}
		}
		sb.append(max + "\n" + count);
		System.out.println(sb);
	}
}
 */

//2675 문자열 반복 
/*
import java.util.*;
import java.io.*;

public class Solve1129{
	public static void main(String[] args)throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		StringTokenizer st; 
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); 
			String str = st.nextToken(); 
			for(int i = 0; i < str.length(); i++) {
				for(int j = 0; j < N; j++) {
					sb.append(str.charAt(i));
				}
			}
			sb.append("\n"); 
		}
		System.out.println(sb); 
	}
}
 */

////10818 최소, 최대 
//애먹었다..
/*
import java.util.*; 
import java.io.*; 

public class Solve1129{ 
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringBuilder sb = new StringBuilder();
		
		Integer.parseInt(br.readLine()); 
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		
		int min = 1000001; 
		int max = -1000001; 
		
		while(st.hasMoreTokens()){ 
			int num = Integer.parseInt(st.nextToken());  
			if(max < num) max = num;
			if(min > num) min = num; 이 부분에서 if 가 아닌 else if를 사용해서 실패함
		}
		
		sb.append(min + " ").append(max); 
		System.out.println(sb); 
	}
}
*/


/* 원래 하려던 방법
import java.util.*; 
import java.io.*; 

public class Solve1129{ 
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); 
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		int min = 1000000;
		int max = -1000000; 
		
		for(int i = 0; i < N; i++) { 
			int num = Integer.parseInt(st.nextToken());  
			if( num >= max) { 
				max = num; 
			}
			if(min >= num) {
				min = num; 
			}
		}
		
		sb.append(min + " ").append(max); 
		System.out.println(sb); 
	}
}
*/

//11720 숫자의 합 
import java.util.*; 
import java.io.*; 

public class Solve1129{ 
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); 
		int sum = 0;
		String str = br.readLine(); 
		
		for(int i = 1; i <= N; i++) { 
			sum = sum + (str.charAt(i-1) - 48);
		}
		System.out.println(sum);
	}
}