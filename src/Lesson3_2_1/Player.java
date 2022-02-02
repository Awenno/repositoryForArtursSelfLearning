package Lesson3_2_1;

import Lesson3_2_1.weapon.*;

public class Player {

    private Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{
                new MachineGun("автомат"),
                new Pistol("пистолет"),
                new RPG("РПГ"),
                new Slingshot("рогатка"),
                new WaterGun("водный пистолет")
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot >= getSlotsCount() || slot < 0) {
            System.out.println("Вы ввели неверный параметр");
            return;
        }
        Weapon weapon = weaponSlots[slot];
        weapon.shot();
    }
}
