package programmers.LV0.p120854;

import java.util.Arrays;

class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(new String[]{"We", "are", "the", "world!"});
        int[] result2 = new Solution().solution(new String[]{"I", "Love", "Programmers."});

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}