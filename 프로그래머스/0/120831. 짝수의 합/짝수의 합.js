function solution(n) {
    var answer = 0;
    for(let idx = 2; idx <= n; idx+=2)
        answer += idx;
    return answer;
}