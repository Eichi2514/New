package programmers.LV1.p134240;

class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            for (int j = 0; j < count; j++) {
                answer.append(i);
            }
        }

        StringBuilder reverse = new StringBuilder(answer).reverse();
        answer.append("0");
        answer.append(reverse);

        return answer.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1, 3, 4, 6}));
        System.out.println(new Solution().solution(new int[]{1, 7, 1, 2}));
    }
}