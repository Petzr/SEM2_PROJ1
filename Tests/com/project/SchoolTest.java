package com.project;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    private ArrayList<Student> alleStudenten = new ArrayList<>();

    @Test
    void verwijderStudent(){
        // arrange
        ArrayList<Student> studenten = new ArrayList<Student>();
        studenten.add(new Student("Daner",1));
        studenten.add( new Student("Peter",2));
        studenten.add( new Student("Dwayne",3));
        studenten.add( new Student("Rajiv",4));


        School school = new School(studenten);


        //act
        int nummer = 3;
        for (int i = 0; i < alleStudenten.size(); i++)
        {
            if (nummer == alleStudenten.get(i).getStudentenNummer())
            {
                alleStudenten.remove(i);
                break;
            }
        }

        var actualResult = school.getAlleStudenten().size();
        var expectedResultcount = studenten.size();
        //Assert
        assertEquals(expectedResultcount, actualResult);
    }


    @Test
    void lijstStudent()
    {

        // arrange
        ArrayList<Student> studenten = new ArrayList<Student>();
        studenten.add(new Student("Daner", 1));
        studenten.add(new Student("Peter", 2));
        studenten.add(new Student("Dwayne", 3));
        studenten.add(new Student("Rajiv", 4));


        School school = new School(studenten);

        //act
        var ActualResult = school.getAlleStudenten();

        //Assert
        assertEquals(studenten, ActualResult);
    }

    @Test
    void lijstExamen()
    {
        // arrange
        ArrayList<Student> studenten = new ArrayList<Student>();
        studenten.add(new Student("Daner", 1));
        studenten.add(new Student("Peter", 2));
        studenten.add(new Student("Dwayne", 3));
        studenten.add(new Student("Rajiv", 4));

        Examen engels = new Examen("Resources/EngelsExamenVragen.txt");
        Examen wiskunde = new Examen("Resources/WiskundeExamenVragen.txt");
        ArrayList<Examen> expectedResult = new ArrayList<Examen>();
        expectedResult.add(engels);
        expectedResult.add(wiskunde);
        School school = new School(expectedResult, studenten);
        //act
        ArrayList<Examen> actualResult = school.getAlleExamens();
        //assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void makenStudent(){
        // arrange
        ArrayList<Student> studenten = new ArrayList<Student>();
        studenten.add(new Student("Daner",1));
        studenten.add( new Student("Peter",2));
        studenten.add( new Student("Dwayne",3));

        School school = new School(studenten);


        //act
        String naam = "Daner";
        Integer nummer = 1;
        alleStudenten.add(new Student(naam, nummer));
        String naam2 = "Peter";
        Integer nummer2 = 2;
        alleStudenten.add(new Student(naam2, nummer2));
        String naam3 = "Dwayne";
        Integer nummer3 = 3;
        alleStudenten.add(new Student(naam3, nummer3));

        var expectedResultcount = studenten.size();
        var actualResult = school.getAlleStudenten().size();
        //Assert
        assertEquals(expectedResultcount, actualResult);
    }
}