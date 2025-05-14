package programmers.LV1.p140108;

class Solution {
    public static int solution(String s) {
        int answer = 0;
        char x = s.charAt(0);
        int a = 0;
        int b = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == x) a++;
            else b++;

            if (a == b && a != 0) {
                x = s.charAt(i + 1);
                a = 0;
                b = 0;
                answer++;
            }
        }
        answer++;
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("banana"));
        System.out.println(new Solution().solution("abracadabra"));
        System.out.println(new Solution().solution("aaabbaccccabba"));
    }
}