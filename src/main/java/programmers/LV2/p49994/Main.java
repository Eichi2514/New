package programmers.LV2.p49994;

import java.util.*;

class Solution {
    public int solution(String dirs) {
        int x = 0, y = 0;
        HashSet<String> visited = new HashSet<>();

        for (char dir : dirs.toCharArray()) {
            int nx = x, ny = y;

            if (dir == 'U') ny++;
            else if (dir == 'D') ny--;
            else if (dir == 'R') nx++;
            else if (dir == 'L') nx--;

            if (nx < -5 || nx > 5 || ny < -5 || ny > 5) continue;

            String path1 = x + "," + y + "," + nx + "," + ny;
            String path2 = nx + "," + ny + "," + x + "," + y;

            visited.add(path1);
            visited.add(path2);

            x = nx;
            y = ny;
        }

        return visited.size() / 2;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution("ULURRDLLU"));
        System.out.println(sol.solution("LULLLLLLU"));
    }
}