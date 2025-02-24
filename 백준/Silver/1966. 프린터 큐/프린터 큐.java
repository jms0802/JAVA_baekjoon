import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        for(int i=0; i<n ; i++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            
            Queue<int[]> q = new LinkedList<>();
            
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                int[] arr = {j, Integer.parseInt(st.nextToken())};
                q.add(arr);
            }
            sb.append(solution(M,q)).append("\n");
        }
        System.out.println(sb);
	}
	
	static int solution(int M, Queue<int[]> q){
	    int count = 0;
	    
	    while(!q.isEmpty()){
	        int[] head = q.poll();
	        boolean isMax = true;
	        
	        for(int[] arr : q){
	            if(head[1] < arr[1]){
	                q.add(head);
	                isMax = false;
	                break;
	            }
	        }
	        
	        if(isMax == false) continue;
	        
	        count++;
	        if(head[0] == M) break;
	    }
	    return count;
	}
}