package programmers.LV2.p84512;

class Solution {
    int count = 0;
    int result = 0;
    String[] vowels = {"A", "E", "I", "O", "U"};

    public int solution(String word) {
        dfs("", word);
        return result;
    }

    private void dfs(String current, String target) {
        if (current.equals(target)) {
            result = count;
            return;
        }

        if (current.length() == 5) return;

        for (String ch : vowels) {
            count++;
            dfs(current + ch, target);
            if (result != 0) return;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution("AAAAE"));
        System.out.println(sol.solution("AAAE"));
        System.out.println(sol.solution("I"));
        System.out.println(sol.solution("EIO"));
    }
}