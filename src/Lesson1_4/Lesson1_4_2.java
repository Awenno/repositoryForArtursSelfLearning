package Lesson1_4; /**
 * Нужно написать программу-помощника индивидуальному предпринимателю (далее - ИП), которая помогает ему выбрать
 * лучшую систему налогооблажения. ИП будет заносить суммы доходов и расходов, а программа будет выбирать для него
 * лучшую систему налогообложения из двух:
 * УСН доходы - налог 6% от доходов;
 * УСН доходы минус расходы - налог 15% от разницы доходов и расходов.
 */

import java.util.Scanner;

public class Lesson1_4_2 {

    public static void main(String[] args) {
        int income = 0; // доходы
        int spending = 0; // расходы

        while (true) {
            mainMenuInformation();
            Scanner scanner = new Scanner(System.in);
            String inputStr = scanner.nextLine();
            if ("end".equals(inputStr)) {
                System.out.println("Программа завершена!");
                break;
            }

            int choiceOperation = Integer.parseInt(inputStr);
            switch (choiceOperation) {
                case 1:
                    System.out.println("Введите сумму дохода: ");
                    String profitStr = scanner.nextLine();
                    int profit = Integer.parseInt(profitStr);
                    income += profit; // сумма доходов
                    break;
                case 2:
                    System.out.println("Введите сумму расхода: ");
                    String expensesStr = scanner.nextLine();
                    int expenses = Integer.parseInt(expensesStr);
                    spending += expenses; // сумма расходов
                    break;
                case 3:
                    favoriteTaxSystem(income, spending);
                    break;
                default:
                    System.out.println("Неверный номер операции. Пожалуйста, выберите операцию из списка.");
            }
        }
    }

    public static int incomeTax(int income) {
        int incomeTaxSum = income * 6 / 100;
        return incomeTaxSum;
    }

    public static int incomeMinusSpendingTax(int income, int spending) {
        int incomeMinusSpendingTax = (income - spending) * 15 / 100;
        if (incomeMinusSpendingTax >= 0) {
            return incomeMinusSpendingTax;
        } else {
            return 0;
        }
    }

    public static int favoriteTaxSystem(int income, int spending) {
        int tax6Percent = incomeTax(income);
        int tax15PercentFromDiff = incomeMinusSpendingTax(income, spending);
        int benefitTax = Math.abs(tax6Percent - tax15PercentFromDiff);
        if (tax6Percent < benefitTax) {
            System.out.println("Мы советуем вам УСН1 - 6% от доходов ");
            System.out.println("Ваш налог составит: " + tax6Percent);
            System.out.println("Налог на другой системе: " + tax15PercentFromDiff);
            System.out.println("Экономия: " + benefitTax);
            return tax6Percent;
        } else {
            System.out.println("Мы советуем вам УСН2 - 15% от разницы доходов и расходов ");
            System.out.println("Ваш налог составит: " + tax15PercentFromDiff);
            System.out.println("Налог на другой системе: " + tax6Percent);
            System.out.println("Экономия: " + benefitTax);
            return tax15PercentFromDiff;
        }
    }

    public static void mainMenuInformation() {
        System.out.println("-----------------------------------------------");
        System.out.println("| Выберите операцию и введите её номер:       |");
        System.out.println("| 1. Добавить новый доход                     |");
        System.out.println("| 2. Добавить новый расход                    |");
        System.out.println("| 3. Выбрать систему налогооблажения          |");
        System.out.println("| 4. Завершить работу программы (введите end) |");
        System.out.println("-----------------------------------------------");
    }
}
