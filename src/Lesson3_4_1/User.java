package Lesson3_4_1;

public class User {
    public static User[] getUsers() {
        User user1 = new User("Admin", "SuperP@ssword", "admin@yandex.ru", 25);
        User user2 = new User("Vitek", "123456a", "vit@mail.ru", 17);
        User user3 = new User("login", "password", "oldhackerman@hack.com", 81);
        return new User[]{user1, user2, user3};
    }


    String login;
    String password;
    String email;
    int age;

    public User(String login, String password, String email, int age) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return password;
    }

    public int getAge() {
        return age;
    }
}
