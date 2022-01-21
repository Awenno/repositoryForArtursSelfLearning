package Lesson3_2_1.weapon;

public class MachineGun extends Weapon {
    private String name;
    public MachineGun(String name) {
        this.name = name;
    }

    @Override
    public void shot() {
        System.out.println("Вы выбрали " + name + ", он стреляет тра-та-та-та!");
    }
}
