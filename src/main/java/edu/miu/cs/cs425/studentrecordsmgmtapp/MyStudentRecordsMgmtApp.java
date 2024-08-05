package edu.miu.cs.cs425.studentrecordsmgmtapp;

import edu.miu.cs.cs425.studentrecordsmgmtapp.model.Student;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyStudentRecordsMgmtApp {

    public static void main(String[] args) {
        Student[] students = {
                new Student("110001", "Dave", "11/18/1951"),
                new Student("110002", "Anna", "12/07/1990"),
                new Student("110003", "Erica", "01/31/1974"),
                new Student("110004", "Carlos", "08/22/2009"),
                new Student("110005", "Bob", "08/05/1994")
        };

        printListOfStudents(students);
        System.out.println();

        List<Student> platinumAlumni = getListOfPlatinumAlumniStudents(students);
        platinumAlumni.forEach(student -> System.out.println(student.getName() + " - " + student.getDateOfAdmission()));
    }

    public static void printListOfStudents(Student[] students) {
        Arrays.stream(students)
                .sorted(Comparator.comparing(Student::getName))
                .forEach(student -> System.out.println(student.getName() + " - " + student.getStudentId() + " - " + student.getDateOfAdmission()));
    }

    public static List<Student> getListOfPlatinumAlumniStudents(Student[] students) {
        return Arrays.stream(students)
                .filter(student -> Period.between(student.getDateOfAdmission(), LocalDate.now()).getYears() >= 30)
                .sorted(Comparator.comparing(Student::getDateOfAdmission).reversed())
                .collect(Collectors.toList());
    }
}
