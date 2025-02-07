import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++){
		    int k = Integer.parseInt(br.readLine());    
		    int n = Integer.parseInt(br.readLine());    
		    
		    System.out.println(makeApt(k,n));
		}
	}
	public static int makeApt(int floor,int room){
        int[][] apt = new int[floor+1][room];
        for(int i=0; i<floor+1;i++){
            for (int j=0; j<room;j++){
                apt[i][0]=1;
                apt[0][j]=j+1;
            }
        }
        for (int i=1; i<floor+1;i++){
            for(int j=1; j<room;j++){
                apt[i][j]=apt[i][j-1]+apt[i-1][j];
            }
        }
        return apt[floor][room-1];
    }
}