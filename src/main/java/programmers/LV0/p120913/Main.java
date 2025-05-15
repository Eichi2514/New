package programmers.LV0.p120913;

import java.util.Arrays;

class Solution {
    public static String[] solution(String my_str, int n) {
        int count = 1;
        int count2 = my_str.length();
        while (count2 > n) {
            count2 -= n;
            count++;
        }
        String[] answer = new String[count];
        int i = 0;
        while (i < count) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    answer[i] = String.valueOf(my_str.charAt(i * n + j));
                } else if (i * n + j < my_str.length()) {
                    answer[i] += my_str.charAt(i * n + j);
                }
            }
            i++;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] result1 = new Solution().solution("abc1Addfggg4556b", 6);
        String[] result2 = new Solution().solution("abcdef123", 3);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}