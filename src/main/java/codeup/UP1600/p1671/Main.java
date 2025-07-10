package codeup.UP1600.p1671;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int me = sc.nextInt();
        int com = sc.nextInt();

        if (me == 0 && com == 1) {
            System.out.println("win");
        } else if (me == 1 && com == 2) {
            System.out.println("win");
        } else if (me == 2 && com == 0) {
            System.out.println("win");
        } else if (me == com) {
            System.out.println("tie");
        } else {
            System.out.println("lose");
        }
    }
}