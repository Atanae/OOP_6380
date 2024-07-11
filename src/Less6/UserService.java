package homework;


public class UserService {
    private final User user;
    private final UserReporter reporter;
    private final UserPersister persister;

    public UserService(User user, UserReporter reporter, UserPersister persister) {
        this.user = user;
        this.reporter = reporter;
        this.persister = persister;
    }

    public void reportUser() {
        reporter.report();
    }

    public void saveUser() {
        persister.save();
    }
}
