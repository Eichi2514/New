package programmers.LV2.p49993;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String tree : skill_trees) {
            StringBuilder filtered = new StringBuilder();

            for (char c : tree.toCharArray()) {
                if (skill.indexOf(c) != -1) {
                    filtered.append(c);
                }
            }

            if (skill.startsWith(filtered.toString())) {
                answer++;
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"}));
    }
}