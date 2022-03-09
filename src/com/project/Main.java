package com.project;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    Student student1 = new Student("Peter", 21092036);
        System.out.println(student1.getNaam());

        System.out.println(student1.getGeslaagdeExamen());

        Examen engels = createExamen("Resources/EngelsExamenVragen.txt");
        System.out.println(engels.getVragen());
        System.out.println(engels.getNaam());

        student1.addGeslaagdExamen(engels);
        System.out.println(student1.getGeslaagdeExamen());

    }

    public static Examen createExamen(String pathname){
        Examen examen = new Examen("Engels examen");
        ArrayList<Vraag> vragen = new ArrayList<>();

        try {
            File file = new File(pathname);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                Vraag vraag = new Vraag(scanner.nextLine());
                vragen.add(vraag);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }

        examen.setVragen(vragen);

        return examen;

    }
}
