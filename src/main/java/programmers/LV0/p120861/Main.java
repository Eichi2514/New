package programmers.LV0.p120861;

import java.util.Arrays;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        answer[0] = 0;
        answer[1] = 0;
        for (int i = 0; i < keyinput.length; i++) {
            if ((board[1] / 2) > answer[1] && keyinput[i].equals("up")) answer[1]++;
            else if (-(board[1] / 2) < answer[1] && keyinput[i].equals("down")) answer[1]--;
            else if (-(board[0] / 2) < answer[0] && keyinput[i].equals("left")) answer[0]--;
            else if ((board[0] / 2) > answer[0] && keyinput[i].equals("right")) answer[0]++;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(new String[]{"left", "right", "up", "right", "right"}, new int[]{11, 11});
        int[] result2 = new Solution().solution(new String[]{"down", "down", "down", "down", "down"}, new int[]{7, 9});

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}