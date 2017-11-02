package com.playtika.students;


public class Student {

    private int id;
    private String name;
    private String surname;
    private int age;

    public Student(int id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }


    public String toString() {
        return id + " " + name + " " + surname + " " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        if (age != student.age) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        return surname != null ? surname.equals(student.surname) : student.surname == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    public int compareTo(Student s) {
        int lastCmp = surname.compareTo(s.surname);
        return (lastCmp != 0 ? lastCmp : surname.compareTo(s.surname));
    }


    public static int compareAge(Student student, Student student2) {
        return student.getAge() - student2.getAge();
    }

}


