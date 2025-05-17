package baekjoon.LV12.p4_1018;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] XY = bf.readLine().split(" ");
        int X = Integer.parseInt(XY[0]);
        int Y = Integer.parseInt(XY[1]);
        String[][] map = new String[X][Y];
        for (int i = 0; i < X; i++) {
            String[] line = bf.readLine().split("");
            for (int j = 0; j < Y; j++) {
                map[i][j] = line[j];
            }
        }
        int minCount = 64;
        String[][] pattern1 = {
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"}
        };
        String[][] pattern2 = {
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"}
        };
        for (int i = 0; i <= X - 8; i++) {
            for (int j = 0; j <= Y - 8; j++) {
                int count1 = 0;
                int count2 = 0;

                for (int x = 0; x < 8; x++) {
                    for (int y = 0; y < 8; y++) {
                        if (!map[i + x][j + y].equals(pattern1[x][y])) {
                            count1++;
                        }
                        if (!map[i + x][j + y].equals(pattern2[x][y])) {
                            count2++;
                        }
                    }
                }
                int min = Math.min(count1, count2);
                minCount = Math.min(minCount, min);
            }
        }
        bw.write(minCount + "");
        bw.flush();
    }
}