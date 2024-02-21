//15439 베라의 패션
import java.util.*; 
import java.io.*; 

public class Solve0221 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine()); 
		System.out.print(n * (n-1) );
	}
}
