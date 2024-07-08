package model;

import java.time.LocalDate;

public interface User {
    int getId();
    String getFirstName();
    String getLastName();
    LocalDate getBirthDate();
}
