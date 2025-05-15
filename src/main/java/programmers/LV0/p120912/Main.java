package programmers.LV0.p120912;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String tmp = "";
        for (int i = 0; i < array.length; i++) {
            tmp += array[i];
        }
        for (int i = 0; i < tmp.length(); i++) {
            if (tmp.charAt(i) == '7') {
                answer++;
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{7, 77, 17}));
        System.out.println(new Solution().solution(new int[]{10, 29}));
    }
}