import java.util.*; 
import java.io.*; 

public class Solve0302 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int N = Integer.parseInt(br.readLine()); 
		
		if(N == 4 || N == 7) {
			System.out.print(-1);
		}
		else if(N % 5 == 0) {
			System.out.print(N /5);
		}
		else if(N% 5 == 1 || N % 5 == 3) {
			System.out.print((N/5) + 1);
		}
		else if(N % 5 == 2 || N % 5 == 4) {
			System.out.print((N/5) + 2);
		}
		
	}
}

//import java.util.*; 
//import java.io.*; 
//
//public class Solve0302 {
//	public static void main(String[] args) throws IOException {
//		int i, j; 
//		int top = 10; 
//		int topwidth =(top / 2 )-2; 
//		int bottom = top * 2 + 1; 
//		
//		for(i = topwidth; i <top; i+= 2) {
//			for(j =0; j <= (top -i); j++) {
//				System.out.print(" ");
//			}
//		for(j = 0; j <= i * 2; j++) {
//			System.out.print("*"); 
//			}
//		for(j = 0; j <= (top - i)*2; j++) {
//			System.out.print(" ");
//			}
//		
//		for(j = 0; j <= i * 2; j++) {
//			System.out.print("*"); 
//			}
//			System.out.print("\n");
//		}
//		
//		for(i = bottom; i >= 0; i-= 2) {
//			for(j = 0; j <= bottom -i; j++) {
//				System.out.print(" ");
//			}
//			
//			for(j = 0; j <= i *2; j++) {
//				System.out.print("*");
//			}
//			System.out.print("\n");
//		}	
//	}
//}