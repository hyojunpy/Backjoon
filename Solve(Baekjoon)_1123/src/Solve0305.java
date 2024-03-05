import java.util.*; 
import java.io.*; 

public class Solve0305 {

	public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int N = Integer.parseInt(br.readLine()); 
			
			if(N%5 == 0 ) System.out.print(N/5);
			else System.out.print(N/5 + 1);
	}

}
