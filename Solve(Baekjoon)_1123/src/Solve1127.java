//10807번 개수 세기 84ms 
/*
import java.util.*; 
import java.io.*;

public class Solve1127{ 
    public static void main(String[] args) throws IOException{ 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int N = Integer.parseInt(br.readLine()); 
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int Sum = 0; 

        for(int i = 0; i < N; i++) 
        { 
        	arr[i] = Integer.parseInt(st.nextToken());  
        }
        int V = Integer.parseInt(br.readLine()); 
        for(int i = 0; i < N; i++)
        {
        	if(arr[i] == V) {
        		Sum++; 
        	}
        }
        
        System.out.println(Sum); 
    }
}
*/
/*
import java.util.*; 
import java.io.*; 

public class Solve1127{
    public static void main(String[] args) throws IOException{ 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringBuilder sb = new StringBuilder(); 
        int[] arr = new int[31];
        
        for(int i = 1; i < 29; i++)
        { 
        	int a = Integer.parseInt(br.readLine()); 
        	arr[a] = 1; 
        }
        
        for(int i = 1; i < arr.length; i++)
        {
        	if(arr[i] != 1) sb.append(i +"\n");
        }
        System.out.println(sb);
    }
}
*/

//2738 행렬덧셈 
/*
import java.util.*;
import java.io.*;

public class Solve1127{ 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringBuilder sb = new StringBuilder(); 
        StringTokenizer st = new StringTokenizer(br.readLine()); 
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int [][] arr = new int[N][M];
        
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                sb.append(arr[i][j] + Integer.parseInt(st.nextToken()) + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
*/

//11654 아스키 코드 
/*	br.readLine() 뒤에도 charAt을 사용할 수 있음, char형에서 byte로 형변환 하여 아스키코드 값을 불러올 수 있다.
import java.io.*;

public class Solve1127{ 
    public static void main(String[] args) throws IOException{ 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        
        byte num = (byte)br.readLine().charAt(0);
        System.out.println(num);
    }
}
*/

//2743 단어 길이 재기
/*
import java.io.*; 

public class Solve1127{ 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println(br.readLine().length());
    }
}
*/

//2744번 대소문자 바꾸기
import java.io.*; 

public class Solve1127{ 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringBuilder sb = new StringBuilder(); 
        String str = br.readLine(); 
        String strr = ""; 
        for(char x : str.toCharArray()) {
            if(Character.isLowerCase(x)){
              strr += Character.toUpperCase(x);  
            }  
            else{
                strr += Character.toLowerCase(x);                  
            }
        }
        sb.append(strr);
        System.out.println(sb);
    }
}