package org.example;

import java.util.Scanner;

public class VelkyKriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        int delkaSvislehoRamene = 1;   // Délka horního i dolního svislého ramene
        int sirkaSvislehoRamene = delkaSvislehoRamene;
        int tloustkaStrednihoRamene = (sirkaSvislehoRamene - 4);  // Tloušťka (počet řádků) středu kříže
        int delkaStreduKrize = (2 * delkaSvislehoRamene + sirkaSvislehoRamene);
        int vzdalenostRameneZleva = (2 * delkaStreduKrize - sirkaSvislehoRamene) / 2;

            System.out.println("******************************");
            System.out.println("* KŘÍŽ S VOLITELNÝM ROZMĚREM *");
            System.out.println("*   Autor: František Belay   *");
            System.out.println("*  Kontakt: frabel@volny.cz  *");
            System.out.println("******************************");

        while (choice != 3) {
            System.out.println("************* Menu: ************");
            System.out.println("* 1 - Rozměr kříže             *");
            System.out.println("* 2 - Zvolit jiný rozměr kříže *");
            System.out.println("* 3 - KONEC PROGRAMU           *");
            System.out.println("********************************");

            System.out.print("Zvolte možnost: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Neplatný vstup. Zadejte prosím číslo.");
                scanner.nextLine();  // Zahoď neplatný vstup
                continue;
            }

            switch (choice) {
                case 1:
                    // Zadání rozměru kříže
                    System.out.print("Zadej rozměr kříže: ");
                    if (scanner.hasNextInt()) {
                        int novyRozmer = scanner.nextInt();
                        if (novyRozmer >= 5) {
                            delkaSvislehoRamene = novyRozmer;
                            sirkaSvislehoRamene = delkaSvislehoRamene;
                            tloustkaStrednihoRamene = (sirkaSvislehoRamene - 4);
                            delkaStreduKrize = (2 * delkaSvislehoRamene + sirkaSvislehoRamene);
                            vzdalenostRameneZleva = (2 * delkaStreduKrize - sirkaSvislehoRamene) / 2;
                            drawCross(delkaSvislehoRamene, sirkaSvislehoRamene, tloustkaStrednihoRamene, delkaStreduKrize, vzdalenostRameneZleva);
                        } else {
                            System.out.println("Rozměr kříže musí být alespoň 5.");
                        }
                    } else {
                        System.out.println("Neplatný vstup. Zadejte prosím číslo.");
                        scanner.nextLine();  // Zahoď neplatný vstup
                    }
                    break;
                case 2:
                    // Zadání nového rozměru kříže
                    System.out.print("Zadej NOVÝ rozměr kříže: ");
                    if (scanner.hasNextInt()) {
                        int novyRozmer = scanner.nextInt();
                        if (novyRozmer >= 5) {
                            delkaSvislehoRamene = novyRozmer;
                            sirkaSvislehoRamene = delkaSvislehoRamene;
                            tloustkaStrednihoRamene = (sirkaSvislehoRamene - 4);
                            delkaStreduKrize = (2 * delkaSvislehoRamene + sirkaSvislehoRamene);
                            vzdalenostRameneZleva = (2 * delkaStreduKrize - sirkaSvislehoRamene) / 2;
                            drawCross(delkaSvislehoRamene, sirkaSvislehoRamene, tloustkaStrednihoRamene, delkaStreduKrize, vzdalenostRameneZleva);
                        } else {
                            System.out.println("Rozměr kříže musí být alespoň 5.");
                        }
                    } else {
                        System.out.println("Neplatný vstup. Zadejte prosím číslo.");
                        scanner.nextLine();  // Zahoď neplatný vstup
                    }
                    break;
                case 3:
                    System.out.println("KONEC PROGRAMU");
                    break;
                default:
                    System.out.println("Neplatná volba. Zadejte 1, 2 nebo 3.");
            }
        }
    }

    public static void drawCross(int delkaSvislehoRamene, int sirkaSvislehoRamene, int tloustkaStrednihoRamene,
                                 int delkaStreduKrize, int vzdalenostRameneZleva) {
        // Vykreslení horního svislého ramene kříže
        for (int i = 1; i <= delkaSvislehoRamene; i++) {
            for (int j = 1; j <= vzdalenostRameneZleva; j++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= sirkaSvislehoRamene; l++) {
                System.out.print("■");
            }
            System.out.println();
        }

        // Vykreslení středního ramene kříže
        for (int i = 1; i <= tloustkaStrednihoRamene; i++) {
            for (int j = 1; j <= delkaStreduKrize; j++) {   // j=1 zn. plná délka středu, větší číslo střed o to číslo zkrátí
                System.out.print("■ ");
            }
            System.out.println();
        }

        // Vykreslení dolního svislého ramene kříže
        for (int i = 1; i <= delkaSvislehoRamene; i++) {
            for (int j = 1; j <= vzdalenostRameneZleva; j++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= sirkaSvislehoRamene; l++) {
                System.out.print("■");
            }
            System.out.println();
        }
    }
}
