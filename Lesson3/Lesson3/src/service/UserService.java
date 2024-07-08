package service;

import model.User;

import java.time.LocalDate;
import java.util.List;

public interface UserService<T extends User> {
    T createUser(String firstName, String lastName, LocalDate birthDate, int groupId);
    T getUserById(int id) throws Exception;
    List<T> getAllUsers();
}
