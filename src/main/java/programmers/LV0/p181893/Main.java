package programmers.LV0.p181893;

import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int[] query) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            answer.add(arr[i]);
        }
        for (int i = 0; i < query.length; i++) {
            int n = answer.size();
            if (i % 2 == 0) {
                for (int j = query[i] + 1; j < n; j++) {
                    answer.remove(answer.size() - 1);
                }
            } else {
                for (int j = 0; j < query[i]; j++) {
                    answer.remove(0);
                }
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{0, 1, 2, 3, 4, 5}, new int[]{4, 1, 2}));
    }
}