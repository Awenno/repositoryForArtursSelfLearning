package Lesson3_2_1;

import Lesson3_2_1.weapon.Weapon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.format("У игрока %d слотов с оружием,"
                            + " введите номер, чтобы выстрелить,"
                            + " -1 чтобы выйти%n",
                    player.getSlotsCount()
            );
            int slot = scanner.nextInt();
            if (slot == -1) {
                System.out.println("Game over!");
                break;
            }
            player.shotWithWeapon(slot);
        }
    }
}

