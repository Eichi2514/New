package programmers.LV0.p120886;

import java.util.Arrays;

class Solution {
    public static int solution(String before, String after) {
        int answer = 0;
        String[] befores = before.split("");
        Arrays.sort(befores);
        before = "";
        for (int i = 0; i < befores.length; i++) {
            before += befores[i];
        }
        String[] afters = after.split("");
        Arrays.sort(afters);
        after = "";
        for (int i = 0; i < afters.length; i++) {
            after += afters[i];
        }
        if (before.equals(after)) answer = 1;
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("olleh", "hello"));
        System.out.println(new Solution().solution("allpe", "apple"));
    }
}