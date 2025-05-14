package programmers.LV1.p160586;

import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String[] keymap, String[] targets) {
        HashMap<Character, Integer> minPress = new HashMap<>();
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < keymap.length; ++i) {
            for (int j = 0; j < keymap[i].length(); ++j) {
                char c = keymap[i].charAt(j);
                if (!minPress.containsKey(c)) {
                    minPress.put(c, j + 1);
                } else {
                    if (j + 1 < minPress.get(c)) {
                        minPress.put(c, j + 1);
                    }
                }
            }
        }

        for (String target : targets) {
            int totalPress = 0;
            boolean possible = true;
            for (char c : target.toCharArray()) {
                if (!minPress.containsKey(c)) {
                    possible = false;
                    break;
                }
                totalPress += minPress.get(c);
            }
            answer.add(possible ? totalPress : -1);
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD", "AABB"}));
        System.out.println(new Solution().solution(new String[]{"AA"}, new String[]{"B"}));
        System.out.println(new Solution().solution(new String[]{"AGZ", "BSSS"}, new String[]{"ASA", "BGZ"}));
    }
}