package programmers.LV0.p120585;

class Solution {
    public static int solution(int[] array, int height) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > height) {
                answer++;
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{149, 180, 192, 170}, 167));
        System.out.println(new Solution().solution(new int[]{180, 120, 140}, 190));
    }
}