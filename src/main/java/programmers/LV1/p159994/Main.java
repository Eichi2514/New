package programmers.LV1.p159994;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;

        while (answer.equals("Yes") && index3 < goal.length) {
            if (index1 < cards1.length && cards1[index1].equals(goal[index3])) {
                index1++;
                index3++;
                continue;
            }
            if (index2 < cards2.length && cards2[index2].equals(goal[index3])) {
                index2++;
                index3++;
                continue;
            }
            answer = "No";
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new String[]{"i", "drink", "water"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));
        System.out.println(new Solution().solution(new String[]{"i", "water", "drink"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));
    }
}