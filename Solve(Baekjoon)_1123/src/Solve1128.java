//2754 학점계산
/*
 * 
import java.io.*; 

public class Solve1128{ 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        String grade = br.readLine();
        double score = 0; 
        
        char a = grade.charAt(0);
        
        if(a == 'A'){
            score = 4.0; 
        }
        else if(a == 'B')
        {
            score = 3.0;             
        }
        else if(a == 'C')
        {
            score = 2.0; 
        }
        else if(a == 'D')
        {
            score = 1.0;
        }
        else score = 0.0; 
        
        a = grade.charAt(1);
        
        if(a == '+'){
                  score += 0.3; 
              }
              else if(a == '-'){
                  score -= 0.3;
              }

        System.out.println(score);
    }
}
 */

//27886 문자와 문자열 
/*
 * 
import java .io.*; 

public class Main{ 
    public static void main(String[] args) throws IOException{ 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        String str = br.readLine(); 
        int a = Integer.parseInt(br.readLine()); 
        System.out.println(str. charAt(a-1)); 
    }
}
 */

//11718 그대로 출력하기 (몇번까지 받아야 하는지 안나와서 for문을 3번 돌리니 실패해서 더이상 값을 안받을때까지 반복하는 문장으로 수정 )

/*
 * import java.io.*; 

public class Main{ 
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringBuilder sb = new StringBuilder();
        String str;
        
        while((str = br.readLine()) != null) 
        {
            sb.append(str + "\n"); 
        }
        
        System.out.println(sb);
    }
} 
 */
//9086 문자열 
/*
import java.io.*;

public class Solve1128{ 
    public static void main(String[] args) throws IOException{ 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringBuilder sb = new StringBuilder(); 
        int T = Integer.parseInt(br.readLine()); 
        String str; 
        
        for(int tc = 1; tc <= T; tc++)
        {
        	str = br.readLine();
        	char a= str.charAt(0);
        	char b= str.charAt(str.length()-1);
        	
        	sb.append(a).append(b + "\n");
        }
        
        System.out.println(sb);
    }
}
 */

//9886 char 사용 안함 
/*
import java.io.*;

public class Main{ 
    public static void main(String[] args) throws IOException{ 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringBuilder sb = new StringBuilder(); 
        int T = Integer.parseInt(br.readLine()); 
        String str; 
        
        for(int tc = 1; tc <= T; tc++)
        {
        	str = br.readLine();        	
        	sb.append(str.charAt(0)).append(str.charAt(str.length()-1) + "\n");
        }
        
        System.out.println(sb);
    }
} 
 */


import java.io.*; 
import java.util.*; 

public class Solve1128 {
     public static void main(String[] args) throws IOException{
         BufferedReader br= new BufferedReader(new InputStreamReader(System.in)); 
         StringTokenizer st = new StringTokenizer(br.readLine()); 
         int A = Integer.parseInt(st.nextToken());
         int B = Integer.parseInt(st.nextToken());
         System.out.println(func1(A,B)); 
         
     }
    
    public static int func1(int A,int B){ 
        return ((A+B) * (A-B));
    }
}
