import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
		    String str = br.readLine();
		    int sum = 0;
		    int m = 1;
		    for(int j=0; j<str.length(); j++){
		        if(str.charAt(j) == 'O'){
		            sum += m;
		            m++;
		        } else {
		            m = 1;
		        }
		    }
		    sb.append(sum).append("\n");
		}
		System.out.println(sb);
	}
}