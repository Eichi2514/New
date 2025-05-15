package programmers.LV0.p181881;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] tmp = new int[arr.length];
        while (true) {
            for (int i = 0; i < arr.length; i++) {
                tmp[i] = arr[i];
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = (arr[i] * 2) + 1;
                }
            }
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (tmp[i] == arr[i]) count++;
            }
            if (count == arr.length) break;
            answer++;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1, 2, 3, 100, 99, 98}));
    }
}