import java.util.*;
import java.io.*;

public class Main //DFS 알고리즘 + 재귀(인접행렬)
{
    public static int count, connect, virus;
    public static int[][] node;
    public static boolean[] visited;
    
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
		count = Integer.parseInt(br.readLine());
        connect = Integer.parseInt(br.readLine());
        
        node = new int[count+1][count+1];
        visited = new boolean[count+1];
        
        StringTokenizer st;
        for(int i=0; i<connect; i++){
            st = new StringTokenizer(br.readLine());    
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            node[a][b] = node[b][a] = 1;
        } 
        
        dfs(1);
        sb.append(virus-1);
        System.out.println(sb);
	}
	
	static void dfs(int start){
	    visited[start] = true;
	    virus++;
	    
	    for(int i=1; i<=count; i++){
	        if(node[start][i] == 1 && !visited[i]){
	            dfs(i);
	        }
	    }
	}
}