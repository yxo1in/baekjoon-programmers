// 빵 : 1, 야채 : 2, 고기 : 3
// length - 4, len - 3, len - 2; len - 1
function solution(ingredient) {
    var answer = 0;
    let arr = [];
    for(i of ingredient){
        arr.push(i);
        if(arr[arr.length-4] === 1 && arr[arr.length-3] === 2 && arr[arr.length-2] === 3 && arr[arr.length-1] === 1){
            let cnt = 0;
            while(cnt !== 4){
                cnt++;
                arr.pop();
            }
            answer++;
        }
    }
    console.log(arr);
    return answer;
}