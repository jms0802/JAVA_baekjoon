function solution(n) {
    let cnt = 1;
    while(true){
        if(cnt * 7 >= n)
            break;
        cnt++;
    }
    return cnt;
}