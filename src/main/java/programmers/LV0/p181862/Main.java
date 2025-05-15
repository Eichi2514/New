package programmers.LV0.p181862;

import java.util.ArrayList;

class Solution {
    public ArrayList<String> solution(String myStr) {
        myStr = myStr.replace("a", "-");
        myStr = myStr.replace("b", "-");
        myStr = myStr.replace("c", "-");
        String[] tmp = myStr.split("-");
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 0; i < tmp.length; i++) {
            if (!(tmp[i].equals(""))) answer.add(tmp[i]);
        }
        if (answer.size() == 0) answer.add("EMPTY");
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("baconlettucetomato"));
        System.out.println(new Solution().solution("abcd"));
        System.out.println(new Solution().solution("cabab"));
    }
}