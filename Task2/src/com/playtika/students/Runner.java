package com.playtika.students;


import java.util.ArrayList;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Jack", "Denils", 80));
        students.add(new Student(2, "Bill", "Klinton", 60));
        students.add(new Student(3, "Mike", "Spenser", 43));
        students.add(new Student(4, "Karl", "Gamer", 18));
        students.add(new Student(5, "Jarl", "Kotur", 24));
        students.add(new Student(6, "Lin", "Jin", 48));
        students.add(new Student(7, "Don", "Perinion", 64));
        students.add(new Student(8, "Sin", "Kin", 21));
        students.add(new Student(9, "Gob", "Bult", 57));
        students.add(new Student(10, "Andry", "Woody", 36));

        System.out.println("Students: " + students);

        Collections.sort(students, Student::compareTo);
        System.out.println("Students sorted by surname " + students);

        Collections.sort(students, Student::compareAge);
        System.out.println("Students sorted by age " + students);

        Logic logic = new Logic();
        List<Student> result = logic.find(students);
        System.out.println("Students with surname beginning on K " + result);

        int average = logic.averAge(students);
        System.out.println("The average age of students is " + average + " years old");

        HashMap<Integer, String> map = (HashMap<Integer, String>) logic.convert(students);
        System.out.println("Map of students looks like " + map);

        HashMap<Integer, String> sortMap = (HashMap<Integer, String>) logic.count(students);
        System.out.println("Students with id more than 6 are :" + sortMap);
    }
}
