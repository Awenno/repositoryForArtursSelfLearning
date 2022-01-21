import java.util.Random;
import java.util.Scanner;

public class TestZone {

    public static final int SIZE = 8;

    public static int[][] newMatrix() {
        int[][] colors = new int[SIZE][SIZE];
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        return colors;
    }

    public static int[][] rotate(int[][] matrix) {
        int[][] rotatedColors = new int[matrix.length][matrix.length];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedColors[i][j] = matrix[SIZE - 1 - j][i];
                System.out.format("%4d", rotatedColors[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        return rotatedColors;
    }

    public static void printMatrix(){
        int[][] matrix = newMatrix();
        int[][] rotatedColors90 = rotate(matrix);
        int[][] rotatedColors180 = rotate(rotate(matrix));
        int[][] rotatedColors270 = rotate(rotate(rotate(matrix)));

    }

    public static void main(String[] args) {
        printMatrix();


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите на сколько градусов вы хотели бы повернуть матрицу: 90, 180 или 270:\n" +
                    "или введите \"end\" для завершения работы программы.\n");

            String inputStr = scanner.nextLine();

            if ("end".equals(inputStr)) {
                System.out.println("Программа завершена");
                break;
            }
            int inputInt = Integer.parseInt(inputStr);
            if ("90".equals(inputInt)) {
                System.out.println("Вы повернули двумерный массив на 90 градусов:\n");
                printMatrix();
            } else if ("180".equals(inputInt)) {
                System.out.println("Вы повернули двумерный массив на 180 градусов:\n");

            } else if ("270".equals(inputInt)) {
                System.out.println("Вы повернули двумерный массив на 270 градусов:\n");

            } else {
                System.out.println("Вы ввели недопустимое число!\n");
            }
        }
    }
}

