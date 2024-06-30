package service;

import model.Teacher;

import java.time.LocalDate;

public class TeacherService {

    public Teacher createTeacher(String firstName, String lastName, LocalDate birthDate, int id) {
        return new Teacher(firstName, lastName, birthDate, id);
    }
}
