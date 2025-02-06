import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		while (T!=0) {
		    T--;
		    
		    String[] str = br.readLine().split(" ");
		
    		int H = Integer.parseInt(str[0]);
    		int W = Integer.parseInt(str[1]);
    		int N = Integer.parseInt(str[2]);
    		
    		int Y = (N % H == 0) ? H : N % H;
    		Y *= 100;
    		
    		int X = (N % H == 0) ? N / H : N / H + 1;
    		
    		System.out.println(Y+X);
		}
	}
}