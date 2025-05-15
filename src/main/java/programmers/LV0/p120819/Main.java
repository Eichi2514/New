package programmers.LV0.p120819;

import java.util.Arrays;

class Solution {
    public int[] solution(int money) {
        int count = 0;
        while (true) {
            if (money >= 5500) {
                money -= 5500;
                count++;
            } else if (money < 5500) {
                break;
            }
        }

        int[] answer = {count, money};
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(5500);
        int[] result2 = new Solution().solution(15000);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}