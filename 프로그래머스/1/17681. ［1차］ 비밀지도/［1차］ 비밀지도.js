function solution(n, arr1, arr2) {
    var answer = [];
    for(let i = 0; i < n; i++){
        let x = arr1[i].toString(2).padStart(n, 0);
        let y = arr2[i].toString(2).padStart(n, 0);
        let temp = '';
        for(let j = 0; j < n; j++){
            if(x[j] === '1' || y[j] === '1')
                temp += '#';
            else
                temp += ' '
        }
        answer.push(temp);
    }
    return answer;
}