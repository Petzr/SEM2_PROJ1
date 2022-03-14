package com.project;


public class Main {

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


        System.out.println("hello");

    }

}
