function solution(sides) {
    var answer = 0;
    sides.sort(function(a, b)  {
        if(a > b) return 1;
        if(a === b) return 0;
        if(a < b) return -1;
    });
    console.log(sides);
    if(sides[0] + sides[1] > sides[2])
        answer = 1;
    else
        answer = 2;
    return answer;
}