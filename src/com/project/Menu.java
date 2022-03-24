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

        School hhs = new School();

        Examen engels = new Examen("Resources/EngelsExamenVragen.txt");
        Examen wiskunde = new Examen("Resources/WiskundeExamenVragen.txt");
        hhs.addExamen(engels);
        hhs.addExamen(wiskunde);

        Student student1 = new Student("Peter", Student.getUniekNummer());
        Student student2 = new Student("Daner", Student.getUniekNummer());
        Student student3 = new Student("Dwayne", Student.getUniekNummer());
        hhs.addStudent(student1);
        hhs.addStudent(student2);
        hhs.addStudent(student3);

        // begin programma
        String input = "";
        while (!input.equals("0")) {
            System.out.println("\n\nWELKOM BIJ HET HOOFDMENU");
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
            input = scanner.nextLine();

            switch (input) {
                case "1": hhs.lijstExamen(); break;
                case "2": hhs.lijstStudenten(); break;
                case "3": hhs.makenStudent(); break;
                case "4": hhs.verwijderStudent(); break;
                case "5": hhs.maakExamen(); break;
                case "6": ; break;
                case "7": ; break;
                case "8": ; break;
                case "0":
                    System.out.println("Fijne dag nog verder!"); break;
                default:
                    System.out.println("Probeer het opnieuw!"); break;
            }
        }

    }
}
