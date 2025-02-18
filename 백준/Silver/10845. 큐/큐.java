import java.util.*;
import java.io.*;

public class Main
{
    static List<Integer> queue = new ArrayList<>();
    static int size;
    static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		for(int i=0; i<N; i++){
		    st = new StringTokenizer(br.readLine());
		    String str = st.nextToken();
		    
		    size = queue.size();
		    switch(str){
    	        case "push":
    	            push(Integer.parseInt(st.nextToken()));
    	            break;
    	        case "pop":
    	            sb.append(pop()).append("\n");
    	            break;
    	        case "size":
    	            sb.append(size()).append("\n");
    	            break;
    	        case "empty":
    	            sb.append(empty()).append("\n");
    	            break;
    	        case "front":
    	            sb.append(front()).append("\n");
    	            break;
	            case "back":
    	            sb.append(back()).append("\n");
    	            break;
    	    }
		}
		System.out.println(sb);
	}
	static void push(int value) {
	    queue.add(value);
	}
	static int pop() {
	    if(size <= 0) return -1;
	    int n = queue.get(0);
	    queue.remove(0);
	    return n;
	}
	static int size() {
	    return size;
	}
	static int empty() {
	    if(size <= 0) return 1;
	    return 0;
	}
	static int front() {
	    if(size <= 0) return -1;
	    return queue.get(0);
	}
	static int back() {
	    if(size <= 0) return -1;
	    return queue.get(size-1);
	}
}