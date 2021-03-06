package com.project;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        School hhs = new School();

        Examen aardrijkskunde = new Examen("Resources/AardrijkskundeExamenvragenMQC.txt");
        Examen engels = new Examen("Resources/EngelsExamenVragen.txt");
        Examen wiskunde = new Examen("Resources/WiskundeExamenVragen.txt");
        hhs.addExamen(engels);
        hhs.addExamen(wiskunde);
        hhs.addExamen(aardrijkskunde);

        Student student1 = new Student("Peter");
        Student student2 = new Student("Daner");
        Student student3 = new Student("Dwayne");
        hhs.addStudent(student1);
        hhs.addStudent(student2);
        hhs.addStudent(student3);

        ArrayList<String> menuKeuzes = new ArrayList<>();
        menuKeuzes.add("EXIT");
        menuKeuzes.add("Lijst met examens");
        menuKeuzes.add("Lijst met studenten");
        menuKeuzes.add("Nieuwe student inschrijven");
        menuKeuzes.add("Student verwijderen");
        menuKeuzes.add("Examen afnemen");
        menuKeuzes.add("Welke examens heeft student gehaald?");
        menuKeuzes.add("Welke student heeft de meeste examens gehaald");

        // begin programma
        String input = "";
        while (!input.equals("0")) {
            printMenu(menuKeuzes);
            input = scanner.nextLine();
            

            switch (input) {
                case "1" -> hhs.lijstExamen();
                case "2" -> hhs.lijstStudenten();
                case "3" -> hhs.makenStudent();
                case "4" -> hhs.verwijderStudent();
                case "5" -> hhs.maakExamen();
                case "6" -> hhs.welkeExamensGehaald();
                case "7" -> hhs.meesteExamensGehaald();
                case "0" -> System.out.println("Fijne dag nog verder!");
                default -> System.out.println("Probeer het opnieuw!");
            }
        }
    }

    public static void printMenu(ArrayList<String> menuKeuzes) {
        System.out.println("\n\n\n\n\n\n*************************************");
        System.out.println("WELKOM BIJ HET HOOFDMENU");
        for (int i=0; i < menuKeuzes.size(); i++) {
            String line = String.format("%2d) %s", i, menuKeuzes.get(i));
            System.out.println(line);
        }
        System.out.print("Uw keuze: ");
    }
}