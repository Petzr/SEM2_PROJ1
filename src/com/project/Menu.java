package com.project;


import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void lijstMenu() // ER IS NU MAAR 1 ARRAYLIST PARAMETER MAAR ER KOMEN WAARSCHIJNLIJK MEER IN DE PARAMETER (DANER)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
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
        int input = scanner.nextInt();
        switch (input) {
            case 1: ; break;
            case 2: School.lijstStudenten(); lijstMenu(); break;
            case 3: School.makenStudent(); lijstMenu(); break;
            case 4: ; lijstMenu(); break;
            case 5: ; break;
            case 6: ; break;
            case 7: ; break;
            case 8: ; break;
            case 0:
                System.out.println("Fijne dag nog verder!"); break;
            default:
                System.out.println("Probeer het opnieuw!"); lijstMenu(); break;
        }
    }

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

        lijstMenu();

        //lijstMenu();


    }
}
