package com.playtika.students;


import java.util.*;


public class Logic {


    public List<Student> find(List<Student> students) {
        ArrayList<Student> choose = new ArrayList<>();
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student current = iterator.next();
            if (current.getSurname().contains("K")) {
                choose.add(current);
            }
        }
        return choose;
    }

    public int averAge(List<Student> students) {

        int ch = 0;
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student current = it.next();
            if (current.getAge() > 0) {
                ch += current.getAge();

            }

        }
        return ch / students.size();
    }

    public Map<Integer, String> convert(List<Student> students) {
        Map map = new HashMap<>();
        for (Student student : students) {
            map.put(student.getId(), student);
        }
        return map;
    }

    public Map<Integer, String> count(List<Student> students) {
        Map mapCount = new HashMap<>();
        for (Student student : students)
            if (student.getId() > 6) {
                mapCount.put(student.getId(), student);

            }
        return mapCount;
    }
}


