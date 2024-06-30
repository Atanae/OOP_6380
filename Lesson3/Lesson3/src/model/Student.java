package model;

import java.time.LocalDate;

public class Student extends User {
//    public String firstName;
//    public String lastName;
//    public LocalDate birthDate;
//    public int id;

    public Student(String firstName, String lastName, LocalDate birthDate, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.id = id;
    }

   @Override
    public String toString() {
        return "Студент: " +
                "имя '" + firstName + '\'' +
                ", фамилия '" + lastName + '\'' +
                ", дата рождения " + birthDate +
                ", id=" + id+'\n';
    }

//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public LocalDate getBirthDate() {
//        return birthDate;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    @Override
//    public int compareTo(Student o) {
//        return Integer.compare(this.id, o.id);
//    }
}
