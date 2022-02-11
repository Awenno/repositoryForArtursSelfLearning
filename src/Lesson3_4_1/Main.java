package Lesson3_4_1;

import java.util.Scanner;
import static Lesson3_4_1.AccessDeniedException.validateUser;
import static Lesson3_4_1.UserNotFoundException.getUserByLoginAndPassword;

public class Main {

    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();
        //Проверить логин и пароль
        User user = getUserByLoginAndPassword(login, password);
        //Вызвать методы валидации пользователя
        validateUser(user);
        System.out.println("Доступ предоставлен");
    }
}
