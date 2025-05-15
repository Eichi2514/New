package programmers.LV0.p120883;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        for (int i = 0; i < db.length; i++) {
            if (db[i][0].equals(id_pw[0])) {
                answer = "wrong pw";
                if (db[i][1].equals(id_pw[1])) {
                    answer = "login";
                }
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new String[]{"meosseugi", "1234"}, new String[][]{{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}}));
        System.out.println(new Solution().solution(new String[]{"programmer01", "15789"}, new String[][]{{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}}));
        System.out.println(new Solution().solution(new String[]{"rabbit04", "98761"}, new String[][]{{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}}));
    }
}