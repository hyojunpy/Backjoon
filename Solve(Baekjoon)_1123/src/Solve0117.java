//import java.util.*; 
//import java.io.*; 
//
//public class Solve0117 { 
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
//        int a = Integer.parseInt(br.readLine()); 
//        int b = 0; 
//        for(int i = 1; i <= a; i++){
//            b += i; 
//        }
//        
//        System.out.println(b); 
//    }
//}
//
//
//import java.util.*; 
//import java.io.*; 
//
//public class Solve0117{ 
//    public static void main(String[] args) throws IOException{ 
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
//        StringBuilder sb = new StringBuilder(); 
//        
//        int tc = Integer.parseInt(br.readLine()); 
//        for(int T = 1; T <= tc; T++){
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken()); 
//            int b = Integer.parseInt(st.nextToken());
//            sb.append("Case #" + T +": " + (a+b) + "\n");
//        }
//        System.out.println(sb); 
//    }
//}

////11022번 A+B -8 
//import java.util.*; 
//import java.io.*; 
//
//public class Solve0117{ 
//    public static void main(String[] args) throws IOException{ 
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
//        StringBuilder sb = new StringBuilder(); 
//        
//        int tc = Integer.parseInt(br.readLine()); 
//        for(int T = 1; T <= tc; T++){
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken()); 
//            int b = Integer.parseInt(st.nextToken());
//            sb.append("Case #" + T +": " + a + " + " + b + " = "+ (a+b) + "\n");
//        }
//        System.out.println(sb); 
//    }
//}

////3003 킹, 퀸, 룩, 비숍, 나이트, 폰
//import java.util.*;
//import java.io.*;
//
//public class Solve0117{ 
//    public static void main(String[] args) throws IOException{ 
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
//        StringTokenizer st = new StringTokenizer(br.readLine()); 
//        StringBuilder sb = new StringBuilder(); 
//        
//        int[] arr = {1,1,2,2,2,8}; 
//    	int[] arr2 = new int[6]; 
//
//        
//        for(int i = 1; i <= arr2.length; i++) {
//        	arr2[i-1] = Integer.parseInt(st.nextToken());
//        }
//        
//        for(int i = 1; i <= 6; i++) {
//        	int a = arr[i-1];  
//        	int b = arr2[i-1];
//            int[] arr3 = new int[6]; 
//            arr3[i-1] = a - b;  
//            sb.append(arr3[i-1] + " "); 
//        }
//        System.out.println(sb); 
//    }
//}

//10757 큰 수 A+B 
////배열로 직접구현 or math.BigInteger을 이용하여 해결 
//import java.util.*;
//import java.io.*;
//import java.math.BigInteger;
//
//public class Solve0117{ 
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine()); 
//		
//		BigInteger A = new BigInteger(st.nextToken());
//		BigInteger B = new BigInteger(st.nextToken());
//
//		A = A.add(B); 
//		
//		System.out.println(A.toString()); 
//	}
//}

//25314 코딩은 체육과목 입니다
//import java.util.*; 
//import java.io.*; 
//
//public class Solve0117{ 
//    public static void main(String[] args) throws IOException{ 
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
//        StringBuilder sb = new StringBuilder(); 
//        
//        int N = Integer.parseInt(br.readLine()); 
//        
//        for(int i = 0; i < (N/4); i++){
//            sb.append("long" + " "); 
//        }
//        sb.append("int"); 
//        
//        System.out.println(sb); 
//    }
//}

// 1271 엄청난 부자2 
// 입력이 long 형을 초과하여 int로 실행했을때는 실패함 
////BigInteger을 이용하여 해결, / = divide , % = remainder
//import java.util.*; 
//import java.io.*;
//import java.math.BigInteger;
//
//public class Solve0117{ 
//    public static void main(String[] args) throws IOException, NumberFormatException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
//        StringTokenizer st = new StringTokenizer(br.readLine()); 
//        StringBuilder sb = new StringBuilder(); 
//        
//        BigInteger M = new BigInteger(st.nextToken()); 
//        BigInteger N = new BigInteger(st.nextToken()); 
//        
//        sb.append(M.divide(N) + "\n"); 
//        sb.append(M.remainder(N)); 
//        
//        System.out.println(sb);
//    }
//}

//5538 마이크로소프트 로고
//import java.util.*; 
//
//public class Solve0117{ 
//	public static void main(String[] args) {
//		System.out.println("       _.-;;-._");
//		System.out.println("'-..-'|   ||   |");
//		System.out.println("'-..-'|_.-;;-._|");
//		System.out.println("'-..-'|   ||   |");
//		System.out.println("'-..-'|_.-''-._|");
//	}
//}

//
//import java.util.*;
//import java.io.*;
//
//public class Solve0117{ 
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int a = 0 ; 
//		
//		for(int i = 0; i <  5; i ++) {
//			int A = Integer.parseInt(br.readLine()); 
//			a += A; 
//		}
//		
//		System.out.println(a); 
//	}
//}

//2338 긴자리계산
import java.util.*;
import java.io.*;
import java.math.*;

public class Solve0117{ 
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BigInteger A = new BigInteger(br.readLine()); 
        BigInteger B = new BigInteger(br.readLine()); 
        
        System.out.println(A.add(B));
        System.out.println(A.subtract(B));
        System.out.println(A.multiply(B));
    }    
}