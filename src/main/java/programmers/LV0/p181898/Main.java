package programmers.LV0.p181898;

class Solution {
    public int solution(int[] arr, int idx) {
        int answer = -1;
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{0, 0, 0, 1}, 1));
        System.out.println(new Solution().solution(new int[]{1, 0, 0, 1, 0, 0}, 4));
        System.out.println(new Solution().solution(new int[]{1, 1, 1, 1, 0}, 3));
    }
}