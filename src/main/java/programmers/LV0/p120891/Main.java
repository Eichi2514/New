package programmers.LV0.p120891;

class Solution {
    public static int solution(int order) {
        int answer = 0;
        String[] game = Integer.toString(order).split("");

        for (int i = 0; i < game.length; i++) {
            if (game[i].equals("3") || game[i].equals("6") || game[i].equals("9")) {
                answer++;
            }
        }


        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(3));
        System.out.println(new Solution().solution(29423));
    }
}