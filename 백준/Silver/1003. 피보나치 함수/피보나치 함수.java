import java.util.*;
import java.io.*;

public class Main
{
    static Integer[][] dp = new Integer[41][2];
    
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		dp[0][0] = 1;
		dp[0][1] = 0;
		dp[1][0] = 0;
		dp[1][1] = 1;
		
        int N = Integer.parseInt(br.readLine());
        
        for(int i=0; i<N; i++){
            int n = Integer.parseInt(br.readLine());
            fibonacci(n);
            sb.append(dp[n][0]).append(" ").append(dp[n][1]).append("\n");
        }
        System.out.println(sb);
	}
	
	static Integer[] fibonacci(int n){
	    if(dp[n][0] == null || dp[n][1] == null) {
	        dp[n][0] = fibonacci(n-1)[0] + fibonacci(n-2)[0];
	        dp[n][1] = fibonacci(n-1)[1] + fibonacci(n-2)[1];
	    }
	    return dp[n];
	}
}