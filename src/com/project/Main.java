package com.project;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void lijstExamen() {

    }

    public static void lijstStudenten(ArrayList<Student> array) {
        for (int i = 0; i < array.size(); i++)
        {
            System.out.println(array.get(i).getStudentenNummer() + " " + array.get(i).getNaam());
        }
    }

    public static Student nieuwStudent(String naam, int studentenNummer) {
        return new Student(naam, studentenNummer);
    }

    public static void verwijderStudent() {
    }

    public static void examenMaken() {

    }

    public static void studentGeslaagd() {

    }

    public static void examenBehaaldDoorStudent() {

    }

    public static void meesteExamenGehaald() {

    }

    public static void main(String[] args) {
        Examen engels = new Examen("Resources/EngelsExamenVragen.txt");
        Examen wiskunde = new Examen("Resources/WiskundeExamenVragen.txt");

        ArrayList<Student> lijstStudent = new ArrayList<>();
        Student student1 = new Student("Peter", 21092036);
        lijstStudent.add(student1);
        System.out.println(lijstStudent.get(0).getStudentenNummer());


        // begin programma
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

        Scanner scanner = new Scanner(System.in);
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

}
