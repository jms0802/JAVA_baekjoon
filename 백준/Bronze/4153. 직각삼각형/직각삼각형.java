import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
		    List<Integer> list = new ArrayList<>();
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    int x = Integer.parseInt(st.nextToken());
		    int y = Integer.parseInt(st.nextToken());
		    int z = Integer.parseInt(st.nextToken());
		    
		    if(x == 0 && y == 0 && z == 0)
		        break;
		    
		    list.add(x);
		    list.add(y);
		    list.add(z);
		    Collections.sort(list);
		    
		    int a = list.get(0) * list.get(0);
		    int b = list.get(1) * list.get(1);
		    int c = list.get(2) * list.get(2);
		    if(a+b == c) {
		        sb.append("right").append("\n");
		    } else {
		        sb.append("wrong").append("\n");
		    }
		}
		System.out.println(sb);
	}
}