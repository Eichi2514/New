package programmers.LV2.p43165;

class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, 0, 0, target);
    }

    private int dfs(int[] numbers, int depth, int sum, int target) {
        if (depth == numbers.length) {
            return sum == target ? 1 : 0;
        }

        int plus = dfs(numbers, depth + 1, sum + numbers[depth], target);
        int minus = dfs(numbers, depth + 1, sum - numbers[depth], target);

        return plus + minus;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution(new int[]{1, 1, 1, 1, 1}, 3));
        System.out.println(sol.solution(new int[]{4, 1, 2, 1}, 4));
    }
}