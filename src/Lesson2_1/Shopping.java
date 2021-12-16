package Lesson2_1;

import java.util.Arrays;
import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {

        // массив продуктов:
        String[] products = {
                "1.Молоко -",
                "2.Хлеб -",
                "3.Масло сливочное -",
                "4.Сахар -",
                "5.Творог(шайба) -"
        };

        // массив стоимости продуктов:
        int[] cost = new int[]{55, 21, 170, 46, 99};

        System.out.println("\nСписок возможных товаров для покупки\n");
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i] + " " + cost[i] + " руб/шт");
        }

        // массив количества выбранных продуктов
        int[] selectedProduct = new int[products.length];

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nВыберите товар и количество или введите `end`");
            String inputStr = scanner.nextLine();
            if ("end".equals(inputStr)) {
                System.out.println("Работа программы завершена.");
                break;
            }

            String[] input = inputStr.split(" ");
            int productNumber = Integer.parseInt(input[0]) - 1;
            int productCount = Integer.parseInt(input[1]);

            selectedProduct[productNumber] = productCount;

            int totalCost = 0;
            for(int totalPrice : selectedProduct) {
                totalCost += totalPrice;
            }
            System.out.println("Ваша корзина:\nНаименование товара Количество Цена/за.ед Общая стоимость");
            System.out.println(productNumber + " " + productCount + " " + Arrays.toString(cost) + " " + totalCost);

        }
    }
}
