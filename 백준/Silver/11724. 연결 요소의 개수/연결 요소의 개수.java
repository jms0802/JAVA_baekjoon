import java.util.*;
import java.io.*;

public class Main
{
    static int[][] arr;
    static boolean[] visited;
    static int count, N;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		arr = new int[N+1][N+1];
		visited = new boolean[N+1];
		
		
		for(int i=0; i<M; i++) {
		    st = new StringTokenizer(br.readLine());
		    
		    int start = Integer.parseInt(st.nextToken());
		    int end = Integer.parseInt(st.nextToken());
		    
		    arr[start][end] = arr[end][start] = 1;
		}
		
		count = 0;
		for(int i=1; i<=N; i++) {
		    if(!visited[i]) {
		        dfs(i);
		        count++;
		    }
		}
		sb.append(count);
		System.out.println(sb);
	}
	static void dfs(int start) {    
	    visited[start] = true;
	    
	    for(int i=1; i<=N; i++) {
	        if(arr[start][i]== 1 && !visited[i])
	            dfs(i);
	    }
	}
}