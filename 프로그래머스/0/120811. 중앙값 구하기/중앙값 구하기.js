function solution(array) {
    let result = [];
    let len = (array.length-1)/2;
    
    for(let i=0;i<array.length;i++){
        let min = 1000;
        for(let j=0;j<array.length;j++){
            if(min>array[j])
                min = array[j];   
        }
        result.push(min);
        for(let j=0;j<array.length;j++){
            if(min === array[j]){
                array[j] = 10000;   
                break;
            }
        }
    }
    
    return result[len];
    
}