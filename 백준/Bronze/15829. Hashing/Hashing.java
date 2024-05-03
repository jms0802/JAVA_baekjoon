import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int M = 1234567891;
		final int r = 31;
			
		int L = sc.nextInt();
		String str = sc.next();
		int H = 0;
		
		for(int i=0;i<str.length();i++) {
			H += (search(str.charAt(i)) * Math.pow(r, i));
		}
		
		System.out.println(H);
	}		
	
	static int search(char c) {
		int x = (int) c - 96;
		return x;
	}
}