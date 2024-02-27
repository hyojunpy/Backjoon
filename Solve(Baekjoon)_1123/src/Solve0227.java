import java.util.*;
import java.io.*;

public class Solve0227 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String s = br.readLine(); 
		int arr[] = new int[26]; 
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1; 
		}
		
		for(int i = 0; i <s.length(); i++) {
			char ch = s.charAt(i); 
			
			if(arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i; 
			}
		}
		for(int val : arr) {
			System.out.print(val + " ");
		}
	}

}
