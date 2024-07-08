package model.impl;

import model.BaseUser;

import java.time.LocalDate;

public class Student extends BaseUser {

    int groupId;
    public Student(int id, String firstName, String lastName, LocalDate birthDate, int groupId) {
        super(id, firstName, lastName, birthDate);
        this.groupId = groupId;
    }
    @Override
    public String toString() {
        return "Студент: " +
                "id=" + id+
                " имя " + firstName +
                ", фамилия " + lastName +
                ", дата рождения " + birthDate +
                ", группа " + groupId+ '\n';
    }

    public int getGroupId() {
        return groupId;
    }
}
