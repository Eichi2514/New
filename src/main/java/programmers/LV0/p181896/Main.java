package programmers.LV0.p181896;

class Solution {
    public int solution(int[] num_list) {
        int answer = -1;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                return i;
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{12, 4, 15, 46, 38, -2, 15}));
        System.out.println(new Solution().solution(new int[]{13, 22, 53, 24, 15, 6}));
    }
}