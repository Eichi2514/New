package programmers.LV0.p120906;

class Solution {
    public static int solution(int n) {
        int answer = 0;
        String number = String.valueOf(n);
        for (int i = 0; i < number.length(); i++) {
            answer += (Integer.parseInt(String.valueOf(number.charAt(i))));
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(1234));
        System.out.println(new Solution().solution(930211));
    }
}