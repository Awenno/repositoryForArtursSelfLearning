/**
 * Напишем программу для сравнения double, float и округления этих типов
 * Функционал программы:
 * 1 Ввод номера желаемой операции (сравнить/округлить/отбросить дробную часть);
 * 2 Ввод двух чисел для сравнения (одно double, другое float) или одного (для округления или отброса дробной части);
 * 3 Вывод результата.
 * <p>
 * Процесс реализации:
 * 1 При запуске программы выведем возможные операции над числами с помощью System.out.println
 * 2 Выберем операцию:
 * * для отброса дробной части — можно привести к типу long;
 * * для сравнения — вычесть одно число из другого и проверить разницу с учётом погрешности; если они оказываются
 * не равны, то указать какое из них больше;
 * * для округления — воспользуемся Math.round(value).
 * 3 Выведем результат.
 */

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Lesson1_4_1 {
    public static void main(String[] args) {
        //double doubleNumb = 0.0;
        //float floatNumb = 0.0f;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            mainMenuInform();
            int inputInt = scanner.nextInt();
            switch (inputInt) {
                case 1:
                    System.out.print("Введите первое число:\n>>");
                    double doubleNumb = scanner.nextDouble();
                    System.out.print("Введите второе число:\n>>");
                    float floatNumb = scanner.nextFloat();
                    comparisonOperation(doubleNumb, floatNumb);
                    break;
                case 2:
                    System.out.print("Введите число для округления:\n>>");
                    doubleNumb = scanner.nextDouble();
                    roundingFractionalPart(doubleNumb);
                    break;
                case 3:
                    System.out.print("Введите число:\n>>");
                    doubleNumb = scanner.nextDouble();
                    discardFractionalPart(doubleNumb);
                    break;
                default:
                    System.out.printf("Неверный номер операции. Пожалуйста, выберите операцию из списка.");
            }
        }
    }

    public static double comparisonOperation(double doubleNumb, float floatNumb) {
        if (doubleNumb == floatNumb) {
            System.out.println("Результат:\nчисла равны");
        } else {
            System.out.println("Результат:\nчисла неравны");
        }
        return floatNumb;
    }

    public static double roundingFractionalPart(double doubleNumb) {
        System.out.println(Math.round(doubleNumb));
        return doubleNumb;
    }

    public static long discardFractionalPart(double doubleNumb) {
        long discardDoubleResult = Long.parseLong(String.format("%.0f", doubleNumb));
        System.out.println(discardDoubleResult);
        return discardDoubleResult;
    }

    public static void mainMenuInform() {
        System.out.println("Операции над double/float");
        System.out.print("1. Сравнить\n2. Округлить\n3. Отбросить друбную часть\n>>");
    }
}
