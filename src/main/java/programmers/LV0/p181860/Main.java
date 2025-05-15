package programmers.LV0.p181860;

import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    answer.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    answer.remove(answer.size() - 1);
                }
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{3, 2, 4, 1, 3}, new boolean[]{true, false, true, false, false}));
    }
}