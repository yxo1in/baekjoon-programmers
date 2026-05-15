function solution(keyinput, board) {
    var answer = [0, 0];
    console.log((board[1]/2).toFixed(0) - 1);
    for(let s of keyinput){
        if(s === 'up'){
            answer[1]++;
        }
        else if(s === 'down'){
            answer[1]--;
        }   
        else if(s === 'left'){
            answer[0]--;
        }
        else if(s === 'right'){
            answer[0]++;
        }
        if(Math.abs(answer[0]) > Math.abs((board[0]/2).toFixed(0) - 1)){
            if(s === 'right'){
                answer[0]--;
            }
            else if(s === 'left'){
                answer[0]++;
            }
        }
        if(Math.abs(answer[1]) > Math.abs((board[1]/2).toFixed(0) - 1)){
            if(s === 'up'){
                answer[1]--;
            }
            else if(s === 'down'){
                console.log(answer[1]);
                answer[1]++;
            }
        }
    }
    return answer;
}