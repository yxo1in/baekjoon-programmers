function solution(before, after) {
    var answer = 1;
    for(let x of before){
        if(after.indexOf(x) === -1){
            return 0;
        }
        else{
            after = after.replace(x, " ");
        }
    }
    return answer;
}