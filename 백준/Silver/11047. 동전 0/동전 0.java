import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[N];
        for(int i=N-1; i>=0; i--){
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        int count = 0;
        int idx = 0;
        while(K > 0) {
            if(arr[idx] <= K) {
                count += K / arr[idx];
                K = K % arr[idx];
            }
            idx++;
        }
        
        sb.append(count);
        System.out.println(sb);
	}
}