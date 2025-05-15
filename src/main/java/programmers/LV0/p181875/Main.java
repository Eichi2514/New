package programmers.LV0.p181875;

import java.util.Arrays;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) answer[i] = strArr[i].toLowerCase();
            else answer[i] = strArr[i].toUpperCase();
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] result1 = new Solution().solution(new String[]{"AAA", "BBB", "CCC", "DDD"});
        String[] result2 = new Solution().solution(new String[]{"aBc", "AbC"});

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}