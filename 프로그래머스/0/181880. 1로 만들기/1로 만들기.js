function solution(num_list) {
    var answer = 0;
    for(n of num_list){
        while(n > 1){
            if(n % 2 !== 0){
                n--;
            }
            n /= 2;
            answer++;
        }
    }
    return answer;
}