import java.util.*; 
import java.io.*; 

public class Solve0303 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		 
		System.out.print(factorial(N));
	}

	public static long factorial(int num) {
		if(num <= 0) return 1; 
		
		return num * factorial(num -1); 
	}
}
