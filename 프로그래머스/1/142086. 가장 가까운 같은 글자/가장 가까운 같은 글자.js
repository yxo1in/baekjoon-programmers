function solution(s) {
    var answer = [];
    let temp = [];
    for(x of s){
        if(temp.indexOf(x) === -1) answer.push(-1);
        else{
            answer.push(answer.length - temp.lastIndexOf(x));
        }
        temp.push(x);
    }
    return answer;
}