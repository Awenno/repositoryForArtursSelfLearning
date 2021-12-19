import java.util.Scanner;

public class TestZone {

    public static void main(String[] args) {
        int[] temps = new int[31];
        boolean[] filledDays = new boolean[31];

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введи день и температуру или end");
            String input = scanner.nextLine(); // "13 -3" или "end"
            if (input.equals("end")) {
                break;
            }
            String[] parts = input.split(" "); // ["13", "-3"]
            int inputDay = Integer.parseInt(parts[0]) - 1; // "13" -> 12
            int inputTemp = Integer.parseInt(parts[1]); // "-3" -> -3

            temps[inputDay] = inputTemp;
            filledDays[inputDay] = true;

            double sum = 0;
            for (int t : temps) {
                sum += t;
            }
            int cnt = 0;
            for (boolean filled : filledDays) {
                if (filled) {
                    cnt++;
                }
            }
            System.out.println("Средняя температура: " + (sum / cnt) + " на основе " + cnt + " дней");
        }
    }
}
