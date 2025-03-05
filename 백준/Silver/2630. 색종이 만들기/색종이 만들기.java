import java.util.*;
import java.io.*;

public class Main
{
    static int white = 0;
    static int blue = 0;
    static int[][] board;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		board = new int[N][N];
		
		for(int i=0; i<N; i++) {
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    for(int j=0; j<N; j++) {
		        board[i][j] = Integer.parseInt(st.nextToken());
		    }
		}
		
		partition(0, 0, N);
		
		sb.append(white).append("\n");
		sb.append(blue).append("\n");
		System.out.println(sb);
	}
	static void partition(int x, int y, int size) {
	    if(checkColor(x,y,size)){
	        if(board[x][y] == 0)
	            white++;
	        else blue++;
	        return;
	    }
	    
	    int resize = size / 2;
	    partition(x,y,resize);
	    partition(x,y+resize, resize);
	    partition(x+resize,y,resize);
	    partition(x+resize,y+resize,resize);
	}
	static boolean checkColor(int x, int y, int size) {
	    int color = board[x][y];
	    
	    for(int i=x; i<x+size; i++) {
	        for(int j=y; j<y+size; j++) {
	            if(color != board[i][j])
	                return false;
	        }
	    }
	    return true;
	}
}