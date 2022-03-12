package hu.progmatic;

import java.util.Scanner;

public class primszam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy számot: ");

        long szam = scanner.nextLong();
        scanner.nextLine();

        long oszto = 1;
        long db = 0;
        while (oszto <= szam) {
            if (szam % oszto == 0) {
                db ++;

            }
            oszto ++;
        }

        if (db == 2) {
            System.out.println("primszám");
        }
        else {
            System.out.println("ez nem prímszám");
        }
        //System.out.println("oszto " + oszto);
    }
}