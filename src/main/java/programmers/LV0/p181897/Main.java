package programmers.LV0.p181897;

import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> answer = new ArrayList<>();
        if (n == 1) {
            for (int i = 0; i <= slicer[1]; i++) {
                answer.add(num_list[i]);
            }
        } else if (n == 2) {
            for (int i = slicer[0]; i <= num_list.length - 1; i++) {
                answer.add(num_list[i]);
            }
        } else if (n == 3) {
            for (int i = slicer[0]; i <= slicer[1]; i++) {
                answer.add(num_list[i]);
            }
        } else {
            for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
                answer.add(num_list[i]);
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(3, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
        System.out.println(new Solution().solution(4, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }
}