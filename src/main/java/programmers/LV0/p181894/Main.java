package programmers.LV0.p181894;

import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int fidx = -2;
        int lidx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                fidx = i;
                break;
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 2) {
                lidx = i;
                break;
            }
        }
        if (fidx == lidx) answer.add(2);
        else if (fidx != -2 && lidx != -1) {
            for (int i = fidx; i <= lidx; i++) {
                answer.add(arr[i]);
            }
        } else answer.add(-1);
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1, 2, 1, 4, 5, 2, 9}));
        System.out.println(new Solution().solution(new int[]{1, 2, 1}));
        System.out.println(new Solution().solution(new int[]{1, 1, 1}));
        System.out.println(new Solution().solution(new int[]{1, 2, 1, 2, 1, 10, 2, 1}));

    }
}