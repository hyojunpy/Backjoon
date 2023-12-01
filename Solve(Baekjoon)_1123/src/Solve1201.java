//2439 별찍기-2
/*
import java.util.*; 
import java.io.*; 

public class Solve1201{ 
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		int N = Integer.parseInt(br.readLine()); 
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N -i; j++) {
					sb.append(' '); 
			}
			for(int k = 1;k <= i; k++) {
				sb.append('*');	
			}
			sb.append('\n');
		}
		
		System.out.println(sb);
	}
}
*/ 

//2577번 숫자의 개수
/*
import java.util.*; 
import java.io.*; 

public class Solve1201{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		int[] arr = new int[10]; 
		int A = 1;
				
		for(int i = 0; i < 3; i++) {
			A *= Integer.parseInt(br.readLine()); 
		}
		String str = Integer.toString(A);
		
		for(int i = 0; i <= 9; i++) {
			for(int j = 0; j < str.length(); j++) {
				if(i == str.charAt(j) - 48) {
					arr[i]++;
				}
			}
			sb.append(arr[i] + "\n"); 
		}
		System.out.println(sb); 
		
	}
}
*/
