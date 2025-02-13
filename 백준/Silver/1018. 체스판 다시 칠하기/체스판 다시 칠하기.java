import java.util.*;
import java.io.*;

public class Main
{
    public static boolean[][] board;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		board = new boolean[N][M];
		for(int i=0; i<N; i++){
		    String str = br.readLine();
		    
		    for(int j=0; j<M; j++){
		        if(str.charAt(j) == 'W') board[i][j] = true;
		        else board[i][j] = false;
		    }
		}
		int result = Integer.MAX_VALUE;
		
		for(int i=0; i<=N-8; i++){
		    for(int j=0; j<=M-8; j++){
		        int sub_result = findMin(i, j);
		        
		        if(sub_result < result) result = sub_result;
		    }
		}
		
		System.out.println(result);
	}
	
	public static int findMin(int row, int col) {
	    int count = 0;
	    boolean first = board[row][col];
	    
		for(int i=row; i<row+8; i++){
		    for(int j=col; j<col+8; j++){
		        if((j%2==0 && board[i][j] != first) || (j%2!=0 && board[i][j] == first)){
		            count++;
		        }
		    }
		    first = !first;
		}
		
		return Math.min(count, 64-count);
	}
}