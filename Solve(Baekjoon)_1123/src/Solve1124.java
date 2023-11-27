
// 10872 팩토리얼 
/*
import java.io.*;
 
 public class Solve1124{ 
	 public static void main(String[] args) throws IOException{ 
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int A = factorial(Integer.parseInt(br.readLine()));
		 		 
		 System.out.println(A);
	 }

	 
	 public static int factorial(int N) { 
		 if(N <= 1) return 1; 
		 return N * factorial(N-1);
	 }
 }
*/ 

//2739 구구단 공백 유의 
/*
import java.io.*; 

public class Solve1124{ 
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringBuilder sb = new StringBuilder(); 
		int a = Integer.parseInt(br.readLine()); 
		
		for(int i = 1; i < 10; i++) { 
			sb.append(a + " "+ "*" + " "+ i + " "  + "=" ).append(" "+a*i).append("\n");
		}
		System.out.println(sb);
	}
}
*/

//10950 A + B -3 
/*
import java.io.*; 
import java.util.*; 

public class Solve1124{ 
    public static void main(String[] args) throws IOException{ 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine()); 
        StringTokenizer st; 
        String str; 
        
        for(int i = 0; i < N; i++){
            str = br.readLine(); 
            int a = str.charAt(0) - 48; 
            int b = str.charAt(2) - 48; 
            sb.append(a+b + "\n"); 
        }
        System.out.println(sb);
    }
}
*/

//2438 별 찍기 
/*
import java.util.*; 
import java.io.*; 

public class Solve1124{ 
    public static void main(String[] args) throws IOException{ 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringBuilder sb = new StringBuilder(); 
        int N = Integer.parseInt(br.readLine()); 
        
        for(int i = 0; i < N; i++)
        {
            for(int j = 1; j <= i+1; j++){ 
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
*/

//10871 X보다 작은 수 (배열 문제) 
/*
import java.util.*;
import java.io.*;

public class Solve1124{ 
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); 
		int X = Integer.parseInt(st.nextToken()); 
		int[] arr = new int[N]; 
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) { 
			arr[i] = Integer.parseInt(st.nextToken()); 
			if(arr[i] < X) sb.append(arr[i] + " ");
		}
		System.out.println(sb);
	}
}
*/

//10871 X보다 작은 수  배열 이용 x  
/*
 import java.util.*;
 
import java.io.*;

public class Solve1124{ 
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); 
		int X = Integer.parseInt(st.nextToken()); 
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) { 
			int value = Integer.parseInt(st.nextToken()); 
			if(value < X) sb.append(value + " ");
		}
		System.out.println(sb);
	}
}
*/