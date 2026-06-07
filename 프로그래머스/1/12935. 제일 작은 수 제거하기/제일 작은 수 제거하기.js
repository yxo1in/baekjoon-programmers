function solution(arr) {
    var answer = [];
    let minIdx = 0;
    let min = Number.MAX_SAFE_INTEGER;
    for(let i = 0; i < arr.length; i++){
        if(arr[i] < min){
            min = arr[i];
            minIdx = i;
        }
    }
    arr.splice(minIdx, 1);
    if(!arr.length)
        return [-1];
    return arr;
}