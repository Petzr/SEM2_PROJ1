package com.project;


import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public void studentMaaktExamen() {

    }

    /* deze methodes moeten nog ergens gemaakt worden

    public static void examenBehaaldDoorStudent() {
    }
    public static void meesteExamenGehaald() {
    }
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Examen engels = new Examen("Resources/EngelsExamenVragen.txt");
        Examen wiskunde = new Examen("Resources/WiskundeExamenVragen.txt");
        ArrayList<Student> lijstStudent = new ArrayList<>();

        // begin programma
        int input= -1;
        while (input != 0) {
            System.out.println("WELKOM BIJ HET HOOFDMENU");
            System.out.print(
                    "1) Lijst met examens\n" +
                            "2) Lijst met studenten\n" +
                            "3) Nieuwe student inschrijven\n" +
                            "4) Student verwijderen\n" +
                            "5) Examen afnemen\n" +
                            "6) Is student geslaagd voor test?\n" +
                            "7) Welke examens heeft student gehaald?\n" +
                            "8) Welke student heeft de meeste examens gehaald?\n" +
                            "0) Exit\n" +
                            "Uw keuze: ");
            try {
                input = scanner.nextInt();
                System.out.println("\n");
            } catch (Exception e) {
                System.out.println("Geen getal mee gegeven");
                input = -1;
            }

            switch (input) {
                case 1: ; break;
                case 2: School.lijstStudenten(); break;
                case 3: School.makenStudent(); break;
                case 4: ; break;
                case 5: ; break;
                case 6: ; break;
                case 7: ; break;
                case 8: ; break;
                case 0:
                    System.out.println("Fijne dag nog verder!"); break;
                default:
                    System.out.println("Probeer het opnieuw!"); break;
            }
        }

    }
}
