package programmers.LV0.p181879;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int tmp = 1;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list.length >= 11) {
                sum += num_list[i];
            } else {
                tmp *= num_list[i];
            }
        }
        if (sum != 0) answer = sum;
        else answer = tmp;
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1}));
        System.out.println(new Solution().solution(new int[]{2, 3, 4, 5}));
    }
}