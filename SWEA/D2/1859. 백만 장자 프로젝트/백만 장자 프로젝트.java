import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); 
        
        int T = Integer.parseInt(br.readLine());
        
        for(int tc = 1; tc <= T; tc++){
            int n = Integer.parseInt(br.readLine()); 
            int[] arr = new int[n]; 
            
            StringTokenizer st = new StringTokenizer(br.readLine()); 
            
            for(int i = 0; st.hasMoreTokens(); i++) {
                arr[i] = Integer.parseInt(st.nextToken()); 
            }
            
			int len = arr.length; 

            long max = Long.MIN_VALUE; 
            int num = 0;
            long cost = 0L; 
            long result = 0L; 
            
            for(int i = len - 1; i >= 0; i--) {
            	if(arr[i] > max) {
                	result += (max * num - cost);
                    max = arr[i]; 
                    cost = 0; 
                    num = 0; 
                } else{
                    cost += arr[i]; 
                    num++; 
                }
            }
            result += (max * num - cost); 
            sb.append("#" + tc + " " + result + "\n"); 
        }
        System.out. println(sb); 
    }
}