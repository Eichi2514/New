package programmers.LV0.p181929;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int m = 1;
        for (int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
        }
        for (int i = 0; i < num_list.length; i++) {
            m *= num_list[i];
        }
        if (sum * sum > m) answer = 1;
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{3, 4, 5, 2, 1}));
        System.out.println(new Solution().solution(new int[]{5, 7, 8, 3}));
    }
}