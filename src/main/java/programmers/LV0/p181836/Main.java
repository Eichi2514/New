package programmers.LV0.p181836;

import java.util.Arrays;

class Solution {
    public static String[] solution(String[] picture, int k) {
        String[] tmp = new String[picture.length];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = "";
            for (int j = 0; j < picture[i].length(); j++) {
                for (int w = 0; w < k; w++) {
                    tmp[i] += picture[i].charAt(j);
                }
            }
        }
        String[] answer = new String[picture.length * k];
        for (int i = 0; i < tmp.length; i++) {
            for (int j = 0; j < k; j++) {
                answer[(i * k) + j] = tmp[i];
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] result1 = new Solution().solution(new String[]{".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."}, 2);
        String[] result2 = new Solution().solution(new String[]{"x.x", ".x.", "x.x"}, 3);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}