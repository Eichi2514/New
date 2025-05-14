package programmers.LV1.p68644;

import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if (!arr.contains(sum)) {
                    arr.add(sum);
                }
            }
        }

        Collections.sort(arr);

        int[] answer = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }

        return answer;
    }
}


public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(new int[]{2, 1, 3, 4, 1});
        int[] result2 = new Solution().solution(new int[]{5, 0, 2, 7});

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}