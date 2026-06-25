function solution(balls, share) {
    var answer = 0;
    const fact = (n) => {
        if(n === 0){
            return 1;
        }
        return n * fact(n-1)
    }
    answer = fact(balls) / (fact(balls-share) * fact(share));
    return +answer.toFixed(0);
}