//
//import java.util.*; 
//import java.io.*; 
//
//public class Solve0219 {
//
//	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder(); 
//		
////		sb.append("    8888888888  888    88888" + "\n").append("   88     88   88 88   88  88" + "\n").append("    8888  88  88   88  88888\n").append("       88 88 888888888 88   88\n").append("88888888  88 88     88 88    888888\n").append("\n").append("88  88  88   888    88888    888888\n").append("88  88  88  88 88   88  88  88\n").append("88 8888 88 88   88  88888    8888\n").append(" 888  888 888888888 88  88      88\n").append("  88  88  88     88 88   88888888\n");
//		
//		sb.append("    8888888888  888    88888\n" + 
//				"   88     88   88 88   88  88\n" + 
//				"    8888  88  88   88  88888\n" + 
//				"       88 88 888888888 88   88\n" + 
//				"88888888  88 88     88 88    888888\n" + 
//				"\n" + 
//				"88  88  88   888    88888    888888\n" + 
//				"88  88  88  88 88   88  88  88\n" + 
//				"88 8888 88 88   88  88888    8888\n" + 
//				" 888  888 888888888 88  88      88\n" + 
//				"  88  88  88     88 88   88888888");
//		System.out.print(sb);
//	}
//
//}

//5339 콜센터 
//import java.util.*; 
//import java.io.*; 
//
//public class Solve0219 {
//
//	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder(); 
//		
//		
//		sb.append("     /~\\\n" + 
//				"    ( oo|\n" + 
//				"    _\\=/_\n" + 
//				"   /  _  \\\n" + 
//				"  //|/.\\|\\\\\n" + 
//				" ||  \\ /  ||\n" + 
//				"============\n" + 
//				"|          |\n" + 
//				"|          |\n" + 
//				"|          |");
//		System.out.print(sb);
//	}
//}


//9654 나부 함대 데이터
//import java.util.*; 
//import java.io.*; 
//
//public class Solve0219 {
//
//	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder(); 
//		
//		
//		sb.append("SHIP NAME      CLASS          DEPLOYMENT IN SERVICE\n" + 
//				"N2 Bomber      Heavy Fighter  Limited    21        \n" + 
//				"J-Type 327     Light Combat   Unlimited  1         \n" + 
//				"NX Cruiser     Medium Fighter Limited    18        \n" + 
//				"N1 Starfighter Medium Fighter Unlimited  25        \n" + 
//				"Royal Cruiser  Light Combat   Limited    4         ");
//		System.out.print(sb);
//	}
//}

//27323 직사각형 
//import java.util.*; 
//import java.io.*; 
//
//public class Solve0219{ 
//    public static void main(String[] args) throws IOException { 
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
//        int A = Integer.parseInt(br.readLine()); 
//        int B = Integer.parseInt(br.readLine()); 
//        int result = A * B; 
//        
//        System.out.print(result); 
//    }
//}

//1264 모음의 개수
//import java.util.*;
//import java.io.*;
//
//public class Solve0219{
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		for(;;) {
//			String s = br.readLine(); 
//			int count = 0; 
//			if(s.equals("#")) {
//				break; 
//			}
//				s = s.toLowerCase();
//			
//			for(int i = 0; i < s.length(); i++) {
//				switch(s.charAt(i)) {
//				case 'a': 
//				case 'o':
//				case 'i':
//				case 'u':
//				case 'e': 
//					count++; 
//				default :
//						break; 
//				}
//			}
//			System.out.print(count + "\n"); 
//		}		
//	}
//}

//10817 세 수 
//import java.util.*;
//import java.io.*;
//
//public class Solve0219{ 
//	public static void main(String[] args) throws IOException{ 
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine()); 
//		
//		int arr[] = new int[3]; 
//		
//		for(int i = 0; i < 3; i++) {
//			arr[i] = Integer.parseInt(st.nextToken()); 
//		}
//		
//		Arrays.sort(arr);
//		
//		System.out.print(arr[0]);
//	}
//}

//1085 직사각형에서 탈출 
import java.util.*; 
import java.io.*; 
import java.math.*;

public class Solve0219{ 
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		
		int X = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		
		int x_min = Math.min(X, W-X); 
		int y_min = Math.min(Y, W-Y); 		
		
		System.out.println(Math.min(x_min, y_min));
	}
}
