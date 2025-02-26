import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
        int N = Integer.parseInt(br.readLine());
        
        int[] coins = {5,2};
        int count = 0;
        
        while(true){
             if(N%coins[0] == 0){
                count += N/coins[0];
                sb.append(count);
                break;
             } else{
                N -= coins[1];
                count++;
             }
             
             if(N < 0){
                sb.append(-1);
                break;
             }
         }
         System.out.println(sb);
	}
}