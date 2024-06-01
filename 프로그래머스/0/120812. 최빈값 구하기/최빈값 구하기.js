function solution(array) {
    let sortarr = array.sort((a,b) => a-b);
    let cnt = 1;
    let max = -1;
    let max_cnt = 0;
    let result_cnt = 0;
    let befornum = -1;
    let isMany = false;
    for(let i=0; i<sortarr.length; i++){
        if(befornum !== sortarr[i])
            cnt=1;
        else
            cnt++;
        if(max_cnt === cnt){
            if(max !== sortarr[i])
                isMany = true;
        }
        if(max_cnt < cnt){
            max_cnt = cnt;
            max = sortarr[i];
            isMany=false;
        }
        
        befornum = sortarr[i];
    }
    
    if(isMany)
        return -1;
    return max;
}