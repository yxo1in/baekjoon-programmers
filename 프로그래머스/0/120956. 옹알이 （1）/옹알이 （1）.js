function solution(babbling) {
    var answer = 0;
    const babList = ['aya', 'ye', 'woo', 'ma'];
    for(let c of babList){
        for(let i = 0; i < babbling.length; i++){
            babbling[i] = babbling[i].replace(c, " ");
        }
    }
    for(let x of babbling){
        if(x.trim() === ''){
            answer++;
        }
    }
    return answer;
}