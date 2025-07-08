package codeup.UP1600.p1635;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] ss = new String[n];

        for (int i = 0; i < n; i++) {
            ss[i] = sc.nextLine();
        }

        Arrays.sort(ss);

        for (int i = 0; i < n; i++) {
            System.out.println(ss[i]);
        }
    }
}