function solution(new_id) {
    var answer = new_id.toLowerCase().replace(/[^\w.-]/g, '').replace(/\.+/g,'.');
    if(answer.indexOf('.') === 0){
        answer = answer.slice(1, answer.length);
    }
    if(answer.indexOf('.') === answer.length-1){
        answer = answer.slice(0, answer.length-1);
    }
    if(answer.length <= 3){
        for(let i = answer.length; i < 3; i++){
            answer += answer.charAt(answer.length-1);
        }
    }
    if(answer.length === 0){
        return 'aaa';
    }
    if(answer.length >= 16){
        answer = answer.slice(0, 15);
    }
    if(answer.charAt(answer.length-1)==='.'){
        answer = answer.slice(0, answer.length-1);
    }
    return answer
}