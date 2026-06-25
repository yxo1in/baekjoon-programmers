function solution(a, b) {
    if(b % a === 0){
        b /= a;
        a /= a;
    }
    for(let i = 0; i < b; i++){
        if(a % i === 0 && b % i === 0){
            a /= i;
            b /= i;
        }
    }
    console.log(a, b);
    while(b !== 1){
        if(b % 2 === 0){
            b /= 2;
        }
        if(b % 5 === 0){
            b /= 5;
        }
        if(b % 2 !== 0 && b % 5 !== 0){
            break;
         }
    }
    console.log(a, b);
    if(b === 1 || b === 2 || b === 5){
        return 1;
    }
    return 2;
}