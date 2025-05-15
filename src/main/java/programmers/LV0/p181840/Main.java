package programmers.LV0.p181840;

class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] == n) answer = 1;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1, 2, 3, 4, 5}, 3));
        System.out.println(new Solution().solution(new int[]{15, 98, 23, 2, 15}, 20));
    }
}