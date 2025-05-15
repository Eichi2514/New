package programmers.LV0.p181886;

import java.util.Arrays;

class Solution {
    public String[] solution(String[] names) {
        double le = names.length / 5.0;
        String[] answer = new String[(int) Math.ceil(le)];
        int index = 0;
        for (int i = 0; i < names.length; i++) {
            if (i % 5 == 0) {
                answer[index] = names[i];
                index++;
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] result1 = new Solution().solution(new String[]{"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"});

        System.out.println(Arrays.toString(result1));
    }
}