function solution(numer1, denom1, numer2, denom2) {
    const denom = denom1*denom2;
    const numer = numer1*denom2 + numer2*denom1;
    let min;
    if(numer > denom)
        min = denom
    else
        min = numer
    while(true){
        if(numer % min == 0 && denom % min == 0)
        return [numer/min,denom/min];
        min -= 1;
    }
}