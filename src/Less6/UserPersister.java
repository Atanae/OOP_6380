package homework;

public class UserPersister {
    private final User user;

    public UserPersister(User user) {
        this.user = user;
    }

    public void save() {
        System.out.println("Save user: " + user.getName());
    }
}