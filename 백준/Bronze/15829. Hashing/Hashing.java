import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final long M = 1234567891;
		final int r = 31;
			
		int L = sc.nextInt();
		String str = sc.next();
		long H = 0, m = 1;
		
		for(int i=0;i<str.length();i++) {
			int x = (int)(str.charAt(i)) - 96; 
			H += x * m % M;
			m = (m * r) % M;
			
		}
		
		System.out.println(H%M);
	}		
}