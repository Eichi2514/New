package programmers.LV2.p148658;

class Solution {
    public int solution(int storey) {
        int answer = 0;

        while (storey > 0) {
            int digit = storey % 10;

            if (digit > 5) {
                answer += 10 - digit;
                storey += 10;
            } else if (digit < 5) {
                answer += digit;
            } else {
                int next = (storey / 10) % 10;
                if (next >= 5) {
                    storey += 10;
                }
                answer += 5;
            }

            storey /= 10;
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution(16));
        System.out.println(sol.solution(2554));
    }
}