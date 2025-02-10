import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		System.out.println(calCoef(N,K));
	}
	
	static int calFactorial(int x) {
	    int result = 1;
	    for(int i=2; i<=x; i++){
	        result *= i;
	    }
	    return result;
	}
	
	static int calCoef(int n, int k) {
	    int top = calFactorial(n);
	    int bottom = calFactorial(n-k) * calFactorial(k);
	    
	    return top / bottom;
	}
}