import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < N; i++) {
            set.add(br.readLine());
        }
        List<String> result = new ArrayList<>();
        for(int i=0; i<M; i++){
            String name = br.readLine();
            if(set.contains(name)){
                result.add(name);
            }
        }
        Collections.sort(result);
        
        sb.append(result.size()).append("\n");
        for(String s : result){
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}
