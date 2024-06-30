package service;

import model.Student;

import java.time.LocalDate;

public class StudentService {

    public Student createStudent(String firstName, String lastName, LocalDate birthDate, int id) {
        return new Student(firstName, lastName, birthDate, id);
    }
}
