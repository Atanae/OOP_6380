package homework;


public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");
        UserReporter reporter = new UserReporter(user);
        UserPersister persister = new UserPersister(user);
        UserService userService = new UserService(user, reporter, persister);

        userService.reportUser();
        userService.saveUser();
    }
}
