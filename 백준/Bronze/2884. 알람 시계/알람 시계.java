import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		
		int H = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		
		if(M < 45) {
		    M += 60;
		    if(--H < 0) H = 23;
		}
		M -= 45;
		
		System.out.println(H + " " + M);
	}
}