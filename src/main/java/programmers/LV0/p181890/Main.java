package programmers.LV0.p181890;

import java.util.ArrayList;

class Solution {
    public ArrayList<String> solution(String[] str_list) {
        ArrayList<String> answer = new ArrayList<>();
        int idx1 = -1;
        int idx2 = -1;
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                idx1 = i;
                break;
            } else if (str_list[i].equals("r")) {
                idx2 = i;
                break;
            }
        }
        if (idx1 != -1) {
            for (int j = 0; j < idx1; j++) {
                answer.add(str_list[j]);
            }
        } else if (idx2 != -1) {
            for (int j = idx2 + 1; j < str_list.length; j++) {
                answer.add(str_list[j]);
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new String[]{"u", "u", "l", "r"}));
        System.out.println(new Solution().solution(new String[]{"l"}));
    }
}