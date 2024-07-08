package model;
import java.time.LocalDate;

public abstract class BaseUser implements User{
    protected int id;
    protected String firstName;
    protected String lastName;
    protected LocalDate birthDate;


    public BaseUser(int id, String firstName, String lastName, LocalDate birthDate){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public LocalDate getBirthDate() {
        return birthDate;
    }


    @Override
    public String toString() {
        return String.format(getClass().getSimpleName() +
                        ": id = %s, firstName = %s, lastName = %s, birthDay = %s",
                id, firstName, lastName, birthDate);
    }


}
