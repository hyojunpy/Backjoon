import java.util.*;
import java.io.*;

public class Solve0313 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); 
		long res = 0; 
		
		for(int i = 1; i <=N; i++) {
			res += i * (N/i);
		}
		System.out.print(res); 
	}

}
