function solution(n) {
    var answer = 0;
    const t = n.toString(3).split("").reverse().join("");
    console.log(t);
    return parseInt(parseInt(t, 3));
}