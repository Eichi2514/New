package programmers.LV0.p181885;

import java.util.Arrays;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int index = 0;
        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) index++;
        }
        String[] answer = new String[index];
        index = 0;
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                answer[index] = todo_list[i];
                index++;
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] result1 = new Solution().solution(new String[]{"problemsolving", "practiceguitar", "swim", "studygraph"}, new boolean[]{true, false, true, false});

        System.out.println(Arrays.toString(result1));
    }
}