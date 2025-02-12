import java.util.*;
import java.io.*;

public class Main
{
    final int BAG_1 = 3, BAG_2 = 5;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		if (n == 4 || n == 7) {
		    sb.append(-1);
        }
        else if (n % 5 == 0) {
            sb.append(n/5);
        }
        else if (n % 5 == 1 || n % 5 == 3) {
            sb.append((n / 5) + 1);
        }
        else if (n % 5 == 2 || n % 5 == 4) {
            sb.append((n / 5) + 2);
        }
        
        System.out.println(sb);
	}
}