// 10952 해결 
/*
import java.util.*;
import java.io.*;

public class Solve1123{ 
    public static void main(String[] args) throws NumberFormatException, IOException{ 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringBuilder sb = new StringBuilder(); 
        
        while(true)
        {	//이부분 좀 더 공부 해볼것 
            String str = br.readLine(); 
            int target = str.indexOf(" "); 
            int result = Integer.parseInt(str.substring(0, target)) + Integer.parseInt(str.substring(target + 1));
            // 
            if(result == 0) break;  
            sb.append(result + "\n");
        }
        System.out.println(sb);
    }
}
*/ 

/*	StringTokenizer() 활용 방법 시간은 같으나 메모리가 200정도 더 많이 나옴  

import java.util.*;
import java.io.*;

public class Solve1123{ 
    public static void main(String[] args) throws NumberFormatException, IOException{ 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringBuilder sb = new StringBuilder(); 
        
        while(true)
        {
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int result = A+B;
            if(result == 0) break;  
            sb.append(result + "\n");
        }
        System.out.println(sb);
    }
}
*/

/*
import java.util.*;
import java.io.*;

public class Solve1123{ 
    public static void main(String[] args) throws NumberFormatException, IOException{ 
    	//while 문에서 받는 입력값이 없을때 사용하는 로직 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringBuilder sb = new StringBuilder(); 
        StringTokenizer st; 
        String str; 
        while((str=br.readLine()) != null)
        // 
        {	 
        	st = new StringTokenizer(str," "); 
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            sb.append(A+B).append("\n");
        }
        System.out.println(sb);
    }
}
*/

// charAt = String에 받은 입력값을 배열 자리수와 같은 매개변수로 나타낼수 있음 
// https://colossus-java-practice.tistory.com/31
//import java.io.*;
//
//public class Solve1123{ 
//    public static void main(String[] args) throws NumberFormatException, IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
//        StringBuilder sb = new StringBuilder(); 
//        String str; 
//        
//        while((str = br.readLine()) != null){ 
//            int a = str.charAt(0) -48;
//            int b = str.charAt(2) -48;
//            sb.append(str.charAt(0)).append("\n");
//        }
//        System.out.println(sb); 
//    } 
//}
//
