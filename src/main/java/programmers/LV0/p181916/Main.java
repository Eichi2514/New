package programmers.LV0.p181916;

class Solution {
    public static int solution(int a, int b, int c, int d) {
        int answer = 0;
        if (a == b && a == c && a == d) answer += 1111 * a;
        else if (a == b && a == c) answer += (10 * a + d) * (10 * a + d);
        else if (a == b && a == d) answer += (10 * a + c) * (10 * a + c);
        else if (a == c && a == d) answer += (10 * a + b) * (10 * a + b);
        else if (b == c && b == d) answer += (10 * b + a) * (10 * b + a);
        else if (a == b && c == d) answer += (a + c) * Math.abs(a - c);
        else if (a == c && b == d) answer += (a + b) * Math.abs(a - b);
        else if (a == d && b == c) answer += (a + b) * Math.abs(a - b);
        else if (a == b) answer += c * d;
        else if (a == c) answer += b * d;
        else if (a == d) answer += c * b;
        else if (b == c) answer += a * d;
        else if (b == d) answer += a * c;
        else if (c == d) answer += a * b;
        else {
            answer = a;
            if (answer > b) answer = b;
            if (answer > c) answer = c;
            if (answer > d) answer = d;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(2, 2, 2, 2));
        System.out.println(new Solution().solution(4, 1, 4, 4));
        System.out.println(new Solution().solution(6, 3, 3, 6));
        System.out.println(new Solution().solution(2, 5, 2, 6));
        System.out.println(new Solution().solution(6, 4, 2, 5));
    }
}