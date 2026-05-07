function solution(numbers) {
    var answer = "";
    const arr = ['zero','one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine'];
    let idx = 0;
    while(numbers.length !== 0){
        if(numbers.startsWith(arr[idx])){
            numbers = numbers.replace(arr[idx], "");
            answer += (idx);
            idx = 0;
            continue;
        }    
        idx++;
    }
    return +answer;
}