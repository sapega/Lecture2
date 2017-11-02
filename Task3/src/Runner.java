import java.util.*;

import java.util.stream.Collectors;

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
        students.add(new Student(9, "Gob", "Bult", 56));
        students.add(new Student(10, "Andry", "Woody", 36));


        System.out.println("Students unsorted: " + students);

        List<Student> sorted = students.stream().sorted((o2, o1) -> -o1.getSurname().compareTo(o2.getSurname())).collect(Collectors.toList());

        System.out.println("Students sorted by surname " + sorted);

        double age = students.stream().filter((student) -> student.getAge() > 0).
                mapToInt(Student::getAge).average().getAsDouble();

        System.out.println("Students average age is: " + age);

        List<Student> surnameSort = students.stream().filter((student) -> student.getSurname().contains("K")).collect(Collectors.toList());
        System.out.println("Students with surname on K are:" + surnameSort);

        Map<Integer, Student> mapConverter = students.stream().distinct().collect(Collectors.toMap(Student::getId, Student -> Student));
        System.out.println("Students in the map: " + mapConverter);

        Map<Integer, Student> sortedMapId = students.stream().filter((student) -> student.getId() > 6).collect(Collectors.toMap(Student::getId, Student -> Student));
        System.out.println("Students with id more than 6 are: " + sortedMapId);
    }
}