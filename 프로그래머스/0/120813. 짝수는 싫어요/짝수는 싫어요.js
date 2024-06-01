function solution(n) {
    let result = [];
    
    for(let i=n;i>0;i--){
        if(i%2!==0)
            result.push(i);
    }
    result.sort((a,b) => a-b);
    return result;
}