package Lesson3_4_1;

public class AccessDeniedException extends Exception{
    public AccessDeniedException (String message) {
        super(message);
    }
    public static void validateUser(User user) throws AccessDeniedException {
        if (user.getAge() >= 18) {
            System.out.println("Добро пожаловать в Матрицу, " + user.login);
        } else {
            throw new AccessDeniedException("Доступ лицам моложе 18 лет запрещен!");
        }
    }
}
