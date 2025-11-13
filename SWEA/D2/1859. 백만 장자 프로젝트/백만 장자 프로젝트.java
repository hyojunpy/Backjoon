import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws NumberFormatException, IOException{
        StringTokenizer st; 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int TC = Integer.parseInt(br.readLine()); 
        
        for(int tc = 1; tc <= TC; tc++) {
        	int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine()); 
            long arr[] = new long[N]; 
            
            for(int i = 0; i < N; i++) {
            	arr[i] = Integer.parseInt(st.nextToken()); 
            }
            
            long current = arr[N -1];  
            long max = 0;
            for(int i = N -1; i >= 0; i--) {
            	if(current < arr[i]) {
                	current = arr[i];
                }else{
                	    max += current -arr[i];
                }
            }
			System.out.println("#" + tc +  " " + max); 
        }
    }
}