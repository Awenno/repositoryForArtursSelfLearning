package Lesson3_4_1;

import static Lesson3_4_1.User.getUsers;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message);
    }
    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPass().equals(password)) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found!!!");
    }
}
