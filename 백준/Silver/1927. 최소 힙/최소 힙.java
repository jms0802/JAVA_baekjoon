import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pQ = new PriorityQueue<>();
		
        for(int i=0; i<N; i++) {
            int x = Integer.parseInt(br.readLine());
            if(x == 0) {
                if(pQ.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(pQ.poll()).append("\n");
                }
            } else {
                pQ.add(x);
            }
        }
        System.out.println(sb);
	}
}