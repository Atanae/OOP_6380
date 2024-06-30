package model;
import java.time.LocalDate;

public class Teacher extends User{

    public Teacher(String firstName, String lastName, LocalDate birthDate, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.id = id;
    }
    @Override
    public String toString() {
        return "Учитель: " +
                "имя '" + firstName + '\'' +
                ", фамилия '" + lastName + '\'' +
                ", дата рождения " + birthDate +
                ", id=" + id+'\n';
    }
}
