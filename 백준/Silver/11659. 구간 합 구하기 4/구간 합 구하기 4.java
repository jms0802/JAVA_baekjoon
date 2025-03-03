import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int [N+1];
		arr[0] = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i = 1 ; i<=N; i++) {
		    arr[i] = Integer.parseInt(st.nextToken()) + arr[i-1];
		}
		
		for(int i=0; i<M; i++) {
		    st = new StringTokenizer(br.readLine());
		    int start = Integer.parseInt(st.nextToken());
		    int end = Integer.parseInt(st.nextToken());
		    
		    sb.append(arr[end] - arr[start-1]).append("\n");
		}
		System.out.println(sb);
	}
}