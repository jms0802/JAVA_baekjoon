import java.util.*;
import java.io.*;

public class Main
{
    static int[] arr;
    static int N;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
        N = Integer.parseInt(br.readLine());
        
        arr = new int[N];
        for(int i=0; i<N ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        
        sb.append(getAverage()).append("\n");
        sb.append(getMedian()).append("\n");
        sb.append(getMany()).append("\n");
        sb.append(gatRange()).append("\n");
        
        System.out.println(sb);
	}
	
	static int getAverage() {
	    double sum = 0;
	    for(double a : arr){
	        sum += a;
	    }
	    return (int) Math.round(sum / N);
	}
	static int getMedian() {
	    int[] mArr = arr;
	    int mid = mArr.length / 2;
	    return mArr[mid];
	}
	static int getMany() {
	    int count = 0;
		int max = -1;
	    int mod = arr[0];
		boolean check = false;
		
		for(int i = 0; i < N - 1; i++) {
			if(arr[i] == arr[i + 1]) {
				count++;
			}else {
				count = 0;
			}
			
			if(max < count) {
				max = count;
				mod = arr[i];
				check = true;
			}else if(max == count && check == true) {
				mod = arr[i];
				check = false;
			}
		}
		return mod;
	}
	static int gatRange() {
	    int max = Arrays.stream(arr).max().getAsInt();
	    int min = Arrays.stream(arr).min().getAsInt();

	    return max-min;
	}
}