package programmers.LV0.p181844;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    arr[i] = 0;
                }
            }
        }
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                index++;
            }
        }
        int[] answer = new int[index];
        index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                answer[index] = arr[i];
                index++;
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(new int[]{293, 1000, 395, 678, 94}, new int[]{94, 777, 104, 1000, 1, 12});
        int[] result2 = new Solution().solution(new int[]{110, 66, 439, 785, 1}, new int[]{377, 823, 119, 43});

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}