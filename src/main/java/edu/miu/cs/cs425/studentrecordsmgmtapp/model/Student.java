

package edu.miu.cs.cs425.studentrecordsmgmtapp.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {
    private String studentId;
    private String name;
    private LocalDate dateOfAdmission;

    public Student() {
    }

    public Student(String studentId, String name, LocalDate dateOfAdmission) {
        this.studentId = studentId;
        this.name = name;
        this.dateOfAdmission = dateOfAdmission;
    }

    public Student(String studentId, String name, String dateOfAdmission) {
        this.studentId = studentId;
        this.name = name;
        this.dateOfAdmission = LocalDate.parse(dateOfAdmission, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(LocalDate dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }
}

