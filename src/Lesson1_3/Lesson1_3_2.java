package Lesson1_3; /**
 * Нужно написать программу, которая будет играть с пользователем в следующую игру.Каждый ход программа спрашивает
 * у него два числа: год и число дней в году. Программа проверяет, правильно ли пользователь указал количество дней в
 * этом году и, если правильно, повторяет ход. В противном случае игра завершается. По окончании игры программа пишет
 * пользователю сколько раз он угадал, это и будет количество набранных очков.
 */

import java.util.Scanner;

public class Lesson1_3_2 {
    // создаем константы
    public static final int LEAP_YEAR_COUNT_DAYS = 366;
    public static final int SIMPLE_YEAR_COUNT_DAYS = 365;

    public static void main(String[] args) {
        // счетчик количества удачных попыток
        int count = 0;

        // цикл игры
        while (true) {
            System.out.println("Введите год и колчичество дней в формате: уууу количество-дней");
            Scanner scanner = new Scanner(System.in);
            int year = scanner.nextInt();
            int days = scanner.nextInt();
            boolean leapYear = checkLeapYear(year);

            // если год невисокосный И не равен константе 366 дней, цикл завершается
            if (!leapYear && days != LEAP_YEAR_COUNT_DAYS) {
                printFailMessage(LEAP_YEAR_COUNT_DAYS, count);
                break;
            }
            // если год високосный И не равен константе 366 дней
            if (leapYear && days != SIMPLE_YEAR_COUNT_DAYS) {
                printFailMessage(SIMPLE_YEAR_COUNT_DAYS, count);
                break;
            }
            count++;
        }
    }
    // метод, проверяющий введенный год на високосность
    private static boolean checkLeapYear(int year) {
        return (year % 400 != 0 && (year % 4 != 0 || year % 100 == 0));
    }
    // метод, выводящий правильное кол-во дней и количество набранных очков на экран
    private static void printFailMessage(int days, int count) {
        System.out.println("Неверно! В этом году " + days + " дней!");
        System.out.print("Набрано очков: " + count);
    }
}
