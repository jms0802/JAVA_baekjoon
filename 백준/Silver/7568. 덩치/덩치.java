import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] bodys = new int[N][N];
		for(int i=0;i<N;i++){
		    String[] str = br.readLine().split(" ");
		    bodys[i][0] = Integer.parseInt(str[0]);
		    bodys[i][1] = Integer.parseInt(str[1]);
		}
		
		for(int i=0; i<N;i++){
		    int rank = 1;
		    
		    for(int j=0;j<N;j++){
		        if(j==i) continue;
		        if(bodys[i][0] < bodys[j][0] && bodys[i][1] < bodys[j][1]){
		            rank++;
		        }
		    }
		    
		    sb.append(rank + " ");
		}
		
		System.out.println(sb);
	}
}