import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        
        int idx=5;
        int[] answer = new int[idx];
        for(int i=0; i<idx; i++){
            answer[i] = num_list[i];
        }
        return answer;
    }
}