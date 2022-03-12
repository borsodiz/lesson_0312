package hu.progmatic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adj meg egy évet:");

        int year = scanner.nextInt();

        if ((year > 1582) && (year % 4 == 0)) {
            if ((year % 100 != 0) || (year % 400 == 0)) {

                System.out.println("Ez szökőév.");

            }
        }System.out.println("Nem szökőév.");
    }
}