function solution(slice, n) {
    let cnt = 1;
    while(true){
        if(cnt * slice >= n)
            break;
        cnt++;
    }
    return cnt;
}