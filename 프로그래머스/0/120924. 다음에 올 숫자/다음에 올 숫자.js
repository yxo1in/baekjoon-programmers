function solution(common) {
    var answer = 0;
    const len = common.length;
    if(common[len - 1] % common[len - 2] == 0 && common[len - 2] % common[len - 3] == 0){
        
        let temp = common[len - 1] / common[len - 2];
        answer = common[len - 1] * temp;
    }
    else{
        let temp = common[len - 1] - common[len -2];
        answer = common[len-1] + temp;
    }
    return answer;
}