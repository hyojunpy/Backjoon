import java.util.*;
import java.io.*;
import java.math.*;

public class Solve0301 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st; 
		
		int N = Integer.parseInt(br.readLine()); 
		double arr[] = new double[N]; 
		double result = 0; 
		st = new StringTokenizer(br.readLine());
		double max = Double.MIN_VALUE;
		
		for(int i = 0; i < N; i++) {
			arr[i] = Double.parseDouble(st.nextToken()); 
			for(double j : arr) {
				max = Math.max(max, j); 
			}
		}
		
		for(int i = 0; i < N; i++) {
			result += arr[i] / max * 100; 
		}
		result = result / N;
		
		System.out.print(result);
	}
}
