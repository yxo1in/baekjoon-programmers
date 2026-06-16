function solution(a, b) {
    var answer = '';
    const then = new Date(2016, a-1, b);
    const day = ['SUN', 'MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT'];
    answer = day[then.getDay()];
    return answer;
}