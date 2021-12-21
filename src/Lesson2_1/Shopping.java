package Lesson2_1;

import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {

        // массив продуктов:
        String[] products = {
                "1.Молоко",
                "2.Хлеб",
                "3.Масло",
                "4.Сахар",
                "5.Сыр"
        };

        // массив стоимости продуктов:
        int[] cost = {55, 21, 170, 46, 99};
        // массив количества выбранных продуктов:
        int[] selectedProducts = new int[products.length];
        // массив общей стоимости продуктов:
        int[] selectedProductSum = new int[cost.length];

        System.out.println("\nСписок возможных товаров для покупки\n");
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i] + " " + cost[i] + " руб/шт");
        }
        int productNumber = 0;
        int productCount = 0;
        int totalPrice = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nВыберите товар и количество или введите `end`");
            String inputStr = scanner.nextLine();

            if ("end".equals(inputStr)) {
                break;
            }

            String[] input = inputStr.split(" ");
            productNumber = Integer.parseInt(input[0]) - 1;
            productCount = Integer.parseInt(input[1]);

            selectedProductSum[productNumber] += cost[productNumber] * productCount;
            selectedProducts[productNumber] += productCount;
        }
        System.out.println("Ваша корзина:\nНаименование товара: Количество: Цена/за.ед: Общая стоимость:");
        for (int i = 0; i < products.length; i++) {
            // если i = 0 (товар не выбран), то НЕ выводить инфу о товаре на экран!
            if (selectedProducts[i] != 0) {
                System.out.println(products[i] + " " + selectedProducts[i] + " " + cost[i] + " " + selectedProductSum[i]);
            }
            totalPrice += selectedProductSum[i];
        }
        System.out.println("\nИтого: " + totalPrice + " рублей");
    }
}

