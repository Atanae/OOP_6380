package model.impl;
import model.BaseUser;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Teacher extends BaseUser {
    private List<Integer> groups = new ArrayList<>();
    public Teacher(int id, String firstName, String lastName, LocalDate birthDate) {
        super(id, firstName, lastName, birthDate);
    }
    public void addGroupId(int id){
        groups.add(id);
    }

    public List<Integer> getGroups() {
        return groups;
    }

    @Override
    public String toString() {
        return "Учитель: " +
                "id=" + id+
                " имя " + firstName +
                ", фамилия " + lastName +
                ", дата рождения " + birthDate +
                ", группы " + groups + '\n';
    }
}
