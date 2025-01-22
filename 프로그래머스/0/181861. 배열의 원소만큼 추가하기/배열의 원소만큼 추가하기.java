class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        answer = new int[sum];
        int idx = 0;
        for(int j : arr){
            for(int i=0;i<j;i++){
                answer[idx++] = j;
            }
        }
        
        return answer;
    }
}