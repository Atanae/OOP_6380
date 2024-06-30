package model;

import Util.UserComparator;

import java.time.LocalDate;

public abstract class User extends UserComparator<User> implements Comparable<User> {

    protected String firstName;
    protected String lastName;
    protected LocalDate birthDate;
    protected int id;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(User o) {
        return compare(this, o);
    }
}
