package com.project;


import java.util.Scanner;

public class Main {

    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
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
            case 2: ; break;
            case 3: ; break;
            case 4: ; break;
            case 5: ; break;
            case 6: ; break;
            case 7: ; break;
            case 8: ; break;
            case 0: ; break;
            default: ; break;
        }
    }

    public static void main(String[] args) {

        // maken van test student
	    Student student1 = new Student("Peter", 21092036);
        System.out.println(student1.getNaam());

        System.out.println(student1.getGeslaagdeExamen());

        // maken van test examen
        Examen engels = new Examen("Resources/EngelsExamenVragen.txt");
        System.out.println(engels.getVragen());
        System.out.println(engels.getNaam());

        student1.addGeslaagdExamen(engels);
        System.out.println(student1.getGeslaagdeExamen());
    }

}
