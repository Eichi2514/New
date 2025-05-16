package codeup.UP1200.p1208;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int order1 = sc.nextInt();
        int order2 = sc.nextInt();
        int[] list = {400, 340, 170, 100, 70};
        int menu1 = list[order1 - 1];
        int menu2 = list[order2 - 1];
        if (menu1 + menu2 > 500) System.out.print("angry");
        else System.out.println("no angry");
    }
}