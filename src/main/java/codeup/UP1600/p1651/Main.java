package codeup.UP1600.p1651;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int h = sc.nextInt();
        int n = sc.nextInt();

        sc.nextLine();

        String[] ss = new String[n];
        for (int i = 0; i < n; i++) {
            ss[i] = sc.nextLine();
        }

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < h; k++) {
                for (int j = 0; j < ss[i].length(); j++) {
                    char c = ss[i].charAt(j);
                    for (int l = 0; l < w; l++) {
                        System.out.print(c);
                    }
                }
                System.out.println();
            }
        }
    }
}