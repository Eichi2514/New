package programmers.LV0.p181867;

import java.util.Arrays;

class Solution {
    public int[] solution(String myString) {
        String[] tmp = myString.split("x");
        int index = 0;
        if (myString.charAt(myString.length() - 1) == 'x') {
            index = 1;
        }
        int[] answer = new int[tmp.length + index];
        for (int i = 0; i < tmp.length; i++) {
            answer[i] = tmp[i].length();
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution("oxooxoxxox");
        int[] result2 = new Solution().solution("xabcxdefxghi");

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}