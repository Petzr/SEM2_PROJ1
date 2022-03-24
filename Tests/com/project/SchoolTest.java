package com.project;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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
        school.makenStudent();
        var actualResult = school.getAlleStudenten();
        var expectedResultcount = studenten.size() - 1;
        //Assert
        assertEquals(expectedResultcount, actualResult.size());
    }


    @Test
    void lijstStudent(){

        // arrange
        ArrayList<Student> studenten = new ArrayList<Student>();
        studenten.add(new Student("Daner",1));
        studenten.add( new Student("Peter",2));
        studenten.add( new Student("Dwayne",3));
        studenten.add( new Student("Rajiv",4));


        School school = new School(studenten);

        //act
        var ActualResult = school.getAlleStudenten();

        //Assert
        assertEquals(studenten,ActualResult);
    }

    @Test
    void lijstExamen(){
        // arrange
    ArrayList<Student> studenten = new ArrayList<Student>();
    studenten.add(new Student("Daner",1));
    studenten.add( new Student("Peter",2));
    studenten.add( new Student("Dwayne",3));
    studenten.add( new Student("Rajiv",4));

    Examen engels = new Examen("Resources/EngelsExamenVragen.txt");
    Examen wiskunde  = new Examen("Resources/WiskundeExamenVragen.txt");
    ArrayList<Examen> expectedResult = new ArrayList<Examen>();
    expectedResult.add(engels);
    expectedResult.add(wiskunde);
    School school = new School(expectedResult, studenten);
        //act
    ArrayList<Examen> actualResult = school.getAlleExamens();
        //assert
    assertEquals(expectedResult,actualResult);
}
    @Test
    void makenStudent(){
        // arrange
        ArrayList<Student> studenten = new ArrayList<Student>();
        studenten.add(new Student("Daner",1));
        studenten.add( new Student("Peter",2));
        studenten.add( new Student("Dwayne",3));
        studenten.add( new Student("Rajiv",4));


        School school = new School(studenten);


        //act
        school.makenStudent();
        var actualResult = school.getAlleStudenten();
        var expectedResultcount = studenten.size() + 1;
        //Assert
        assertEquals(expectedResultcount, actualResult.size());
    }
}