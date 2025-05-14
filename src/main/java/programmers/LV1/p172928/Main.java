package programmers.LV1.p172928;

import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int h = 0, w = 0;

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    h = i;
                    w = j;
                    break;
                }
            }
        }

        for (String route : routes) {
            char direction = route.charAt(0);
            int steps = Integer.parseInt(route.substring(2));
            int nh = h, nw = w;

            for (int step = 1; step <= steps; step++) {
                if (direction == 'E') nw++;
                else if (direction == 'W') nw--;
                else if (direction == 'S') nh++;
                else if (direction == 'N') nh--;

                if (nh < 0 || nh >= park.length || nw < 0 || nw >= park[0].length()) {
                    nh = h;
                    nw = w;
                    break;
                }

                if (park[nh].charAt(nw) == 'X') {
                    nh = h;
                    nw = w;
                    break;
                }
            }

            h = nh;
            w = nw;
        }

        return new int[]{h, w};
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(new String[]{"SOO", "OOO", "OOO"}, new String[]{"E 2", "S 2", "W 1"});
        int[] result2 = new Solution().solution(new String[]{"SOO", "OXX", "OOO"}, new String[]{"E 2", "S 2", "W 1"});
        int[] result3 = new Solution().solution(new String[]{"OSO", "OOO", "OXO", "OOO"}, new String[]{"E 2", "S 3", "W 1"});

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result3));
    }
}