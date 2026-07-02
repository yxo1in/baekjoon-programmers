function solution(k, score) {
    var answer = [];
    let temp = [];
    for(s of score){
        temp.push(s);
        temp.sort((a, b) => {
            return b - a;
        })
        if(temp.length < k){
            answer.push(temp[temp.length-1]);
        }
        else{
            answer.push(temp[k-1]);
        }
    }
    return answer;
}